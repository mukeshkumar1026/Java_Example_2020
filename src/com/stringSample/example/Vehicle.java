package com.stringSample.example;

public abstract class Vehicle {

//    int no_of_type;

    abstract void show();

}
class Car extends Vehicle {

    void show() {
        System.out.println("start with key");
    }
}
class Scooter extends Vehicle {
    void show() {
        System.out.println("start with kick");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.show();
        Scooter obj1 = new Scooter();
        obj1.show();
    }
}
