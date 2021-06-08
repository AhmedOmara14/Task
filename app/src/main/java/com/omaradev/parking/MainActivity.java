package com.omaradev.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private int endTime;
    private int time;
    private static final int valueOfParking = 20;
    private int capacity = 0;
    int plate;
    private ArrayList<Time> listOfPrice = new ArrayList<>();
    int totalPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enterVehicle
        enterVehicle(plate, time);


        listOfPrice.add(new Time(6, 10, 3));
        listOfPrice.add(new Time(10, 23, 1));
        listOfPrice.add(new Time(23, 6, 0));


    }

    private Boolean CheckCapacity(int c) {
        if (c > valueOfParking) {
            return false;
        }
        return true;
    }

    private void enterVehicle(int plate, int time) {
        if (CheckCapacity(capacity)) {
            ArrayList<Vehicle> Vehicle = new ArrayList<>();
            Vehicle.add(new Vehicle(plate, time));
            capacity += 1;
        }
    }


    private int calculate(int startTime, int endTime) {
        int parkingprice = 0;
        for (int i = startTime; i < endTime; i++) {
            for (Time u : listOfPrice) {
                if (i >= u.getStarttime() && i <= u.getEndTime()) {
                    parkingprice += u.getPrice();
                }
            }


        }
        return parkingprice;
    }

    private void exit(Vehicle vehicle, int exitTime) {
         capacity-=1;
         totalPrice += calculate(vehicle.getStartTime(), endTime);
        //printTotalPrice
    }
}