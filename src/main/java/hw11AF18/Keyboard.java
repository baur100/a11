package hw11AF18;

public class Keyboard {
    private String brand;
    private String model;
    public boolean isWireless;

public Keyboard(){};
    public Keyboard(String brand, String model, boolean isWireless) {
        this.brand = brand;
        this.model = model;
        this.isWireless = isWireless;
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
        return "Keyboard" +
                "\nBrand= " + brand +
                "\nModel= " + model +
                "\nWireless=" + isWireless;
    }
}
