package com.example.myshop.houses;

import com.example.myshop.housing.HousingStatus;

public class Villa extends AbstractHouse {

    public Villa(int floor, int countOfRooms, int countOfSleepingPlaces, String housingArea) {
        super(floor, countOfRooms, countOfSleepingPlaces, housingArea);
        statusOfHouse = HousingStatus.VILLA;
    }

    @Override
    public boolean isHaveRestZone() {
        return isHaveRestZone;
    }

    @Override
    public boolean isHavePool() {
        return isHavePool;
    }

    @Override
    public boolean isHaveBBQ() {
        return isHaveBBQ;
    }

    @Override
    public void setIsHaveRestZone(boolean isHaveRestZone) {
        this.isHaveRestZone = isHaveRestZone;
    }

    @Override
    public void setIsHavePool(boolean isHavePool) {
        this.isHavePool = isHavePool;
    }

    @Override
    public void setIsHaveBBQ(boolean isHaveBBQ) {
        this.isHaveBBQ = isHaveBBQ;
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
        return statusOfHouse;
    }

}
