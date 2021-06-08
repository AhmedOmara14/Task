package com.omaradev.parking;

public class Vehicle {
    private int plate;
    private int startTime;

    public Vehicle(int plate, int startTime) {
        this.plate = plate;
        this.startTime = startTime;
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }


}
