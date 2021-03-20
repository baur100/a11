package hw11;

public class Keyboard extends Computer {
    private String brand;
    private String model;
    public boolean isWireless;

    // Add constructors, getters, toString;

    public Keyboard(String brand, String model) {
        this.brand = brand;
        this.model = model;
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
