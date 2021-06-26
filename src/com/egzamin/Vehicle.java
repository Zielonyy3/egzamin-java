package com.egzamin;

public abstract class Vehicle implements  Driveable{
    public String plateNumber;
    public String vinNumber;
    public String color;
    public float price;
    public float fuelUsage;
    public float tankFulfillment;
    public int numberOfKilometers;

    public void drive(float numberOfKilometers){
        float range = getRange();
        if(numberOfKilometers > range){
            System.out.println("Masz za malo paliwa aby tyle przejeachac");
        }else{
            float usage =(numberOfKilometers/100) * fuelUsage;
            tankFulfillment -= usage;
            System.out.println("Zuzyles "+ usage + "litrow paliwa");
        }
    }
    public void refuel(){
        System.out.println("Tankujemy!");
    }

    public float getRange(){
        return  (tankFulfillment / fuelUsage) * 100;
    }
}
