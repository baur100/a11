package hw9_UA;

public class Cars {
    private String make;
    private String model;
    private String color;
    private int year;

    public void getCars(){
        System.out.println("My favorite car is a " + year + " " + make + " " + model + " " + "in the color " + color + ".");
    }

    public Cars() {
    }

    public Cars(String make, String model, String color, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getMake(){
        return this.make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        if(year<=0){
            throw new IllegalArgumentException("Invalid year.");
        }
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

}
