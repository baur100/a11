package hw11;

public class Monitor {
    private String brand;
    private String model;

    public Monitor(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
