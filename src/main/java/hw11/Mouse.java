package hw11;

public class Mouse extends Computer {
    private String brand;
    private String model;
    public boolean isWireless;


    public Mouse(String brand, String model, Boolean isWireless){
        this.brand = brand;
        this.model = model;
        this.isWireless = isWireless;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public boolean isWireless(){
        return isWireless;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
