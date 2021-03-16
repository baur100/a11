package hw11;

public class Keybord {
    private String brand;
    private String model;
    public boolean isWireless;

    public Keybord(String brand,String model,boolean isWireless){
        this.brand=brand;
        this.model=model;
        this.isWireless=isWireless;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Keybord{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
