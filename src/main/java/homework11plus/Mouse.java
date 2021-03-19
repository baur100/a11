package homework11plus;

public class Mouse {
    private String brand;
    private String model;
    public boolean isWireless;

    public Mouse(String brand, String model, boolean isWireless){
        this.brand = brand;
        this.model = model;
        this.isWireless = isWireless;
    }

    public Mouse(){}

    public String brand(){
        return brand;
    }

    public String model(){
        return model;
    }

    public boolean isWireless(){
        return isWireless;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand: '" + brand + '\'' +
                ", model: '" + model + '\'' +
                ", isWireless: " + isWireless +
                '}';
    }
}
