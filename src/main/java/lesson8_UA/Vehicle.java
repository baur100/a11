package lesson8_UA;

public class Vehicle {
    public String make;
    public String model;
    public String color;
    public String year;

    public void drive(int speed) {
        System.out.println(make + " " + model + " driving with speed = " + speed + " mph" );
    }

    public void beep() {
        System.out.println(color + " vehicle is beeping!!");
    }



}
