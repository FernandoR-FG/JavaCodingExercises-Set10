package com.javacourse.enumexercises;
// public si se quiere poner en otro archivo
enum Direction {
    NORTH("North"),
    SOUTH("South"),
    EAST("East"),
    WEST("West");

    private String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Direction left() {
        // You are to implement the logic that correctly gets the Direction on the "left"
        // If we represent the directions in a circular format going clockwise
        // then the direction to the "left" of NORTH is WEST, of WEST is SOUTH, of SOUTH is EAST, and of EAST is NORTH
        switch (this) {
            // Write your code here
            case NORTH:
                return WEST;
            case WEST:
                return SOUTH;
            case SOUTH:
                return EAST;
            case EAST:
                return NORTH;
            default:
            throw new IllegalArgumentException("Direccion no encontrada");
        }
       
    }

    public Direction right() {
        // Similarly, you are to implement the logic that correctly gets the Direction on the "right"
        // If we represent the directions in a circular format going clockwise
        // then the direction to the "right" of NORTH is EAST, of EAST is SOUTH, of SOUTH is WEST, and of WEST is NORTH
        switch (this) {
            // Write your code here
            case NORTH:
                return EAST;
            case EAST:
                return SOUTH;
            case SOUTH:
                return WEST;
            case WEST:
                return NORTH;
            default:
            throw new IllegalArgumentException("Direccion no encontrada");
        }
      
    }
}



//Segundo ejercicio
enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    DaysOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        // Write your code here to return the name of the day
        return name;
    }

    public boolean isWeekday() {
        // Write your code here to check if this day is a weekday
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        // Write your code here to check if this day is a holiday
        return !isWeekday();
    }
}
public class EnumExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
