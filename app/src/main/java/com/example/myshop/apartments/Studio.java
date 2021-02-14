package com.example.myshop.apartments;

import com.example.myshop.housing.HousingStatus;

public class Studio extends AbstractApartment {

    public Studio(int floor, int countOfRooms, int countOfSleepingPlaces, String housingArea) {
        super(floor, countOfRooms, countOfSleepingPlaces, housingArea);
        statusOfApartment = HousingStatus.STUDIO;
    }

    @Override
    public boolean isHaveBalcony() {
        return isHaveBalcony;
    }

    @Override
    public boolean isHaveAccessToElevator() {
        return isHaveAccessToElevator;
    }

    @Override
    public void setIsHaveBalcony(boolean isHaveBalcony) {
        this.isHaveBalcony = isHaveBalcony;
    }

    @Override
    public void setIsHaveAccessToElevator(boolean isHaveAccessToElevator) {
        this.isHaveAccessToElevator = isHaveAccessToElevator;
    }

    @Override
    public boolean isHaveBar() {
        return isHaveBar;
    }

    @Override
    public void setIsHaveBar(boolean isHaveBar) {
        this.isHaveBar = isHaveBar;
    }

    @Override
    public int getCountOfRooms() {
        return countOfRooms;
    }

    @Override
    public String getHousingArea() {
        return housingArea;
    }

    @Override
    public int getCountOfSleepingPlaces() {
        return countOfSleepingPlaces;
    }

    @Override
    public int getFloor() {
        return floor;
    }

    @Override
    public String getTypeOfHousing() {
        return TYPE_OF_HOUSING;
    }

    @Override
    public HousingStatus getStatusOfHousing() {
        return statusOfApartment;
    }

}
