package homework11plus;

public class Keyboard {
    private String brand;
    private String model;
    public boolean isWireless;

    public Keyboard(String brand, String model, boolean isWireless) {
        this.brand = brand;
        this.model = model;
        this.isWireless = isWireless;
    }

    public Keyboard(){}

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
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
