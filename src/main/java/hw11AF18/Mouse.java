package hw11AF18;

public class Mouse {
    private String brand;
    private String model;
    public boolean isWireless;

public Mouse(){};
    public Mouse(String brand, String model, boolean isWireless) {
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
        return "Mouse " +
                "\nBrand= " + brand + '\'' +
                "\nModel= " + model + '\'' +
                "\nWireless= " + isWireless;
    }
}
