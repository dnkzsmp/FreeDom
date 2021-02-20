package com.example.myshop.apartments;

import com.example.myshop.housing.Housing;
import com.example.myshop.housing.HousingStatus;

public abstract class AbstractApartment implements Housing {

    protected int floor;
    protected int countOfRooms;
    protected int countOfSleepingPlaces;
    protected String housingArea;
    protected boolean isHaveBalcony;
    protected boolean isHaveAccessToElevator;
    protected boolean isHaveBar;
    protected HousingStatus statusOfApartment;
    protected final String TYPE_OF_HOUSING = "КВАРТИРА";

    public abstract boolean isHaveBalcony();

    public abstract boolean isHaveAccessToElevator();

    public abstract void setIsHaveBalcony(boolean isHaveBalcony);

    public abstract void setIsHaveAccessToElevator(boolean isHaveAccessToElevator);

    public AbstractApartment(int floor, int countOfRooms, int countOfSleepingPlaces, String housingArea) {
        this.floor = floor;
        this.countOfRooms = countOfRooms;
        this.countOfSleepingPlaces = countOfSleepingPlaces;
        this.housingArea = housingArea;
        isHaveBalcony = isHaveAccessToElevator = isHaveBar = false;
    }

    @Override
    public String toString() {
        return "Apartment {" +
                "floor = " + floor +
                ", countOfRooms = " + countOfRooms +
                ", countOfSleepingPlaces = " + countOfSleepingPlaces +
                ", housingArea = '" + housingArea + '\'' +
                ", isHaveBalcony = " + isHaveBalcony +
                ", isHaveAccessToElevator = " + isHaveAccessToElevator +
                ", isHaveBar = " + isHaveBar +
                ", statusOfApartment = " + statusOfApartment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractApartment)) return false;
        AbstractApartment that = (AbstractApartment) o;
        return floor == that.floor &&
                countOfRooms == that.countOfRooms &&
                countOfSleepingPlaces == that.countOfSleepingPlaces &&
                isHaveBalcony() == that.isHaveBalcony() &&
                housingArea.equals(that.housingArea);
    }

}
