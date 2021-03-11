package hw8;

public class Vehicle {
    public String make;
    public String model;
    public String color;
    public int year;

    public void drive(int speed) {
        System.out.println(make + " " + model + " driving with speed = " + speed + " Miles Per Hour");
    }

}
