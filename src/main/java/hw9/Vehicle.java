package hw9;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String color;

    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public Vehicle(){

    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    String returnVehicle (String make, String model, int year, String color) {
        String vehicleParameters;
        vehicleParameters = "Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nColor: "+color;
        return vehicleParameters;
    }
    public void drive(){
        System.out.println(make + ", "+model+", "+year+", "+color);
    }
}
