package homework11plus;

public class Monitor {
    private String brand;
    private String model;

    public Monitor(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public Monitor(){}

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
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
