package hw11AF18;

public class Processor {
   private String brand;
   private String model;
   private double speed;
   private int cachMemory;

   public Processor(){};
    public Processor(String brand, String model, double speed, int cachMemory) {
        this.brand = brand;
        this.model=model;
        this.speed = speed;
        this.cachMemory = cachMemory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCachMemory() {
        return cachMemory;
    }

    public void setCachMemory(int cachMemory) {
        this.cachMemory = cachMemory;
    }



    @Override
    public String toString() {
        return "Processor" +
                "\nBrand= " + brand +
                "\nModel= "+model+
                "\nSpeed=" + speed +
                "\nCach memory=" + cachMemory;
    }
}
