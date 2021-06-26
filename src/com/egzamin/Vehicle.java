package com.egzamin;

public abstract class Vehicle implements  Driveable{
    public String plateNumber;
    public String vinNumber;
    public String color;
    public double price;
    public double fuelUsage;
    public double tankFulfillment;
    public double tankMax;
    public int numberOfKilometers;

    public Vehicle(double price, double fuelUsage, double tankFulfillment, double tankMax){

        this.price = price;
        this.fuelUsage = fuelUsage;
        this.tankFulfillment = tankFulfillment;
        this.tankMax = tankMax;
        this.numberOfKilometers = 0;
    }

    public void drive(double numberOfKilometers){
        double range = getRange();
        if(numberOfKilometers > range){
            System.out.println("Masz za malo paliwa aby tyle przejeachac");
        }else{
            double usage =(numberOfKilometers/100) * this.fuelUsage;
            this.tankFulfillment -= usage;
            System.out.println("Zuzyles "+ usage + "litrow paliwa");
        }
    }
    public void refuel(double amount, boolean toMaximum){
        double emptyVal = this.tankMax - this.tankFulfillment;
        if(toMaximum){
            System.out.println("Zatankowano do pelna!");
            this.tankFulfillment = this.tankMax;
        }else if(amount > emptyVal){
            System.out.println("Wiecej sie nie dalo!");
            this.tankFulfillment = this.tankMax;
        }else{
            this.tankFulfillment += amount;
        }
    }

    public double getRange(){
        return  (this.tankFulfillment / this.fuelUsage) * 100;
    }

    public void changeColor(String color){
        System.out.println("Zmieniono kolora na: "+ color);
        this.color = color;
        this.price *= 1.05;
    }
}
