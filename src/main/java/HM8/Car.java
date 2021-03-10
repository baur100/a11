package HM8;

public class Car {
    public String make;
    public String model;
    public Integer year;
    public String body;
    public boolean engine;
    public String run;
    public String off;

    public String statusOfEng(){
        if (engine) {
            return "Engine is " + run + "\n";
        }
        return "Engine is " + off + "\n";
    }

    public String typeOfTheCar(){
        return "Make: " + make + ", Model: " + model + ", Year: " + year + "\n";
    }
}
