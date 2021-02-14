package com.example.myshop.apartments;

import com.example.myshop.housing.HousingStatus;

public class Economy extends AbstractApartment {

    public Economy(int floor, int countOfRooms, int countOfSleepingPlaces, String housingArea) {
        super(floor, countOfRooms, countOfSleepingPlaces, housingArea);
        statusOfApartment = HousingStatus.ECONOMY;
    }

    @Override
    public boolean isHaveBalcony() {
        return isHaveBalcony;
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
    public boolean isHaveAccessToElevator() {
        return false;
    }

    @Override
    public boolean isHaveBar() {
        return false;
    }

    @Override
    public void setIsHaveBar(boolean isHaveBar) {
        this.isHaveBar = isHaveBar;
    }

    @Override
    public int getCountOfRooms() {
        return 0;
    }

    @Override
    public String getHousingArea() {
        return housingArea;
    }

    @Override
    public int getCountOfSleepingPlaces() {
        return 0;
    }

    @Override
    public int getFloor() {
        return 0;
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
