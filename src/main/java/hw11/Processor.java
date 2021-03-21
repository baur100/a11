package hw11;

public class Processor {
    private String brand;
    private String model;

    // Add constructors, getters, toString;

    public Processor(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
