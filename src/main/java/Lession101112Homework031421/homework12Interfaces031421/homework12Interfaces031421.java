/*
Create an interface and 2 classes which implements it
Create 2 objects of each class
Assign one object to interface type*/


package Lession101112Homework031421.homework12Interfaces031421;

public class homework12Interfaces031421 {
    public static void main(String[] args) {
        System.out.println("This is a test: homework 12");


    System.out.println("");
    vehicleInterface031421 HondaAccord = new passengerCarClass031421("HondaAccord");
    HondaAccord.start();
    HondaAccord.stop();

    vehicleInterface031421 FordF150 = new truckClass031421( "FordF150");
    FordF150.start();
    FordF150.stop();


    } //end of class
} //end of main

