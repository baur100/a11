package hw11AF18;

public class PowerSupply {
    private String brand;
    private String model;

    public PowerSupply(){};
    public PowerSupply(String brand, String model) {
        this.brand = brand;
        this.model = model;
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

    @Override
    public String toString() {
        return "PowerSupply" +
                "\nBrand= " + brand +
                "\nModel= " + model;
    }
}
