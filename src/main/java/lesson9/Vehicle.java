package lesson9;

public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int year;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void drive(int speed){
        System.out.println(make+" " + model+ " driving with the speed = " + speed + " miles per hour");
    }
    public void beep(){
        System.out.println(color+" vehicle is beeping");
    }
}
