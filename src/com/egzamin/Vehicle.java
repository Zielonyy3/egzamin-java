package com.egzamin;

public abstract class Vehicle implements  Driveable{
    public String plateNumber;
    public String vinNumber;
    public String color;
    public float price;
    public float fuelUsage;
    public float tankFulfillment;
    public int numberOfKilometers;

    public void drive(){
        System.out.println("Jedziemy!");
    }
    public void refuel(){
        System.out.println("Tankujemy!");
    }

    public float getRange(){
        return  (tankFulfillment / fuelUsage) * 100;
    }
}
