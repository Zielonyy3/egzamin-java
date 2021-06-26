package com.egzamin;

public class Car extends Vehicle{
    public int numberOfDoors;
    public int weight;

    public Car(double price, double fuelUsage, double tankFulfillment, double tankMax){
        super(price, fuelUsage, tankFulfillment, tankMax);
    }
}
