package lesson8_UA;

public class Vehicle {
    public String make;
    public String model;
    public String color;
    public int year;

    public void drive(int speed){
        System.out.println(make + " " + model + " is driving with speed " + speed + " miles per hour!");
    }

    public void beep(){
        System.out.println(color + " " + "vehicle is    beeping!!");
    }
}


