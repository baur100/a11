package hw11_UA;

public class Monitor extends Computer {
    private String brand;
    private String model;

    // Add constructors, getters, toString;

    public Monitor(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
