package homework9;

public class Smartphone {
    private String model;
    private double size;
    private int battery;
    private boolean memoryCard;

    public Smartphone(String model, double size, int battery, boolean memoryCard){
        this.model = model;
        this.size = size;
        this.battery = battery;
        this.memoryCard = memoryCard;
    }

    public Smartphone(){}

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getSize(){
        return this.size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public int getBattery(){
        return this.battery;
    }

    public void setBattery(int battery){
        this.battery = battery;
    }

    public boolean getMemoryCard(){
        return this.memoryCard;
    }

    public void setMemoryCard(boolean memoryCard){
        this.memoryCard = memoryCard;
    }

    public void printInfo(){
        System.out.println(model + " has screen size of " + size + " inches with battery size of " + battery + "mAh");
        System.out.println("Memory card slot? " + memoryCard);
    }
}
