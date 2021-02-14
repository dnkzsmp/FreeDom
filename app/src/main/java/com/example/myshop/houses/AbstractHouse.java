package com.example.myshop.houses;

import com.example.myshop.housing.Housing;
import com.example.myshop.housing.HousingStatus;

public abstract class AbstractHouse implements Housing {
    protected final String TYPE_OF_HOUSING = "ДОМ";

    public abstract boolean isHaveRestZone();

    public abstract boolean isHavePool();

    public abstract boolean isHaveBBQ();

    public abstract void setIsHaveRestZone(boolean isHaveRestZone);

    public abstract void setIsHavePool(boolean isHavePool);

    public abstract void setIsHaveBBQ(boolean isHaveBBQ);

    protected boolean isHaveRestZone;
    protected boolean isHavePool;
    protected boolean isHaveBBQ;
    protected boolean isHaveBar;
    protected int floor;
    protected int countOfRooms;
    protected int countOfSleepingPlaces;
    protected String housingArea;
    protected HousingStatus statusOfHouse;

    public AbstractHouse(int floor, int countOfRooms, int countOfSleepingPlaces, String housingArea) {
        this.floor = floor;
        this.countOfRooms = countOfRooms;
        this.countOfSleepingPlaces = countOfSleepingPlaces;
        this.housingArea = housingArea;
        isHaveRestZone = isHavePool = isHaveBBQ = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractHouse)) return false;
        AbstractHouse that = (AbstractHouse) o;
        return isHaveRestZone() == that.isHaveRestZone() &&
                isHavePool() == that.isHavePool() &&
                isHaveBBQ() == that.isHaveBBQ() &&
                floor == that.floor &&
                countOfRooms == that.countOfRooms &&
                countOfSleepingPlaces == that.countOfSleepingPlaces;
    }

    @Override
    public String toString() {
        return "House {" +
                "TYPE_OF_HOUSING = '" + TYPE_OF_HOUSING + '\'' +
                ", isHaveRestZone = " + isHaveRestZone +
                ", isHavePool = " + isHavePool +
                ", isHaveBBQ = " + isHaveBBQ +
                ", isHaveBar = " + isHaveBar +
                ", floor = " + floor +
                ", countOfRooms = " + countOfRooms +
                ", countOfSleepingPlaces = " + countOfSleepingPlaces +
                ", housingArea = '" + housingArea + '\'' +
                ", statusOfHouse = " + statusOfHouse +
                '}';
    }
}
