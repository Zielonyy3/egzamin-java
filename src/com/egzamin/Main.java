package com.egzamin;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(50000, 7, 30, 60);
        Car car2= new Car(100000, 5.2, 30, 82.5);

        car1.drive(30);
        car1.refuel(50, false);
        System.out.println(car1.getRange());
        car1.changeColor("red");
    }
}
