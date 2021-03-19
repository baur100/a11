package homework11plus;

public class Memory {
    private String brand;
    private String model;

    public Memory(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Memory(){}

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
        return "Memory{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
