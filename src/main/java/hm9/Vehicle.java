package hm9;

import java.time.Year;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void Vehicle(){}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String printInfo(){
        return "\nTest Drive \nMake: " + make + "\nModel: " + model;
    }
    public String printClass(){
        return "Year: " + year +"\n";
    }

}
