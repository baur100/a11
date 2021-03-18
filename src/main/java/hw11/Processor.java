package hw11;

public class Processor {
    private String model;
    private String brand;
    private String name;

    public Processor(String model, String brand, String name) {
        this.model = model;
        this.brand = brand;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
