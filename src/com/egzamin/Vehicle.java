package com.egzamin;

public abstract class Vehicle implements  Driveable{
    public String plateNumber;
    public String vinNumber;
    public String color;
    public float price;
    public float fuelUsage;
    public float tankFulfillment;
    public float tankMax;
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
    public void refuel(float amount, boolean toMaximum){
        float emptyVal = tankMax - tankFulfillment;
        if(toMaximum){
            System.out.println("Zatankowano do pelna!");
            tankFulfillment = tankMax;
        }else if(amount > emptyVal){
            System.out.println("Wiecej sie nie dalo!");
            tankFulfillment = tankMax;
        }else{
            tankFulfillment += amount;
        }
    }

    public float getRange(){
        return  (tankFulfillment / fuelUsage) * 100;
    }

    public void changeColor(string color){
        System.out.println("Zmieniono kolora na: "+ color);
        price *= 1.05;
    }
}
