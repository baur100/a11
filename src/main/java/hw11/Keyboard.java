package hw11;

public class Keyboard {
    private String brand;
    private String model;
    public boolean isWireless;

    public Keyboard(String brand, String model, boolean isWireless) {
        this.brand = brand;
        this.model = model;
        this.isWireless = isWireless;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isWireless() {
        return isWireless;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
