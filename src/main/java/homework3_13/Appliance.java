package homework3_13;

public class Appliance {
    protected String brand;
    protected String model;
    protected String color;
    protected double capacity;
    protected double price;

    public Appliance(String brand,String model,String color,double capacity,double price){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.capacity=capacity;
        this.price=price;
    }
    public Appliance(){}

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String toString(){
        return "Appliance-"+"Brand: "+brand+", Model: "+model+", Color:"+color+", Capacity:"+capacity+", Price:"+price+".";
    }
}
