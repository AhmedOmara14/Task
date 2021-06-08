package com.omaradev.parking;

public class Time {
    private int starttime;
    private int endTime;
    private int price;

    public Time(int starttime, int endTime, int price) {
        this.starttime = starttime;
        this.endTime = endTime;
        this.price = price;
    }

    public int getStarttime() {
        return starttime;
    }

    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
