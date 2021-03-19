package homework11plus;

public class PowerSupply {
    private String brand;
    private String model;

    public PowerSupply(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public PowerSupply(){}

    public String getBrand() {
        return brand;
    }

    public String model(){
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
