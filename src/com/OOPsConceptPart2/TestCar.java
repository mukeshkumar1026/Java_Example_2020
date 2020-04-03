package com.OOPsConceptPart2;

public class TestCar {
//when same method is present in parent class as well as in child class with the same name and same arguments, is called MethodOvrriding
//compile static ------compile time polymorphism
    public static void main(String[] args) {
    BMW obj=new BMW();
    obj.satrt();
    obj.stop();
    obj.refuel();
    obj.theftSefaty();
    obj.engine();

    Car c=new Car();
    c.start();
    c.stop();
    c.refuel();

    //top casting
    Car c1=new BMW();
    //child class object can referred the parent class reference variable===dynamic polymorphism
        //runtime polymorphism
        c1.start();
        c1.stop();
        c1.refuel();

        //down casting
       // BMW b1= (BMW) new Car();




    }
}
