package homework3_13;

public class Microwave extends Appliance{
    private int wattage;
    private  int power;

    public Microwave(String brand,String model,String color,double capacity,int wattade,int power,double price){
        super(brand,model,color,capacity,price);
        this.wattage=wattade;
        this.power=power;
    }

    public int getWattage() {
        return wattage;
    }
    public void setWattage(int wattage){
        this.wattage=wattage;
    }

    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power=power;
    }
    public String toString(){
        return "Microwave-Brand: "+brand+", Model: "+model+", Color:"+color+", Capacity:"+capacity+"Cu.ft"+", Wattage:"+wattage+"watts"+", Price:"+price+".";
    }
}
