package hw11_UA;

public class Disk {    private String brand;
    private String model;
    public boolean isWireless;
    private int size;
    private DiskType type;

    // Add constructors, getters, toString;

    public Disk(String model, boolean isWireless, int size, DiskType type){
        this.model = model;
        this.isWireless = isWireless;
        this.size = size;
        this.type = type;
    }
    public String getModel(){
        return model;
    }
    public boolean getIsWireless(){
        return isWireless;
    }
    public int getSize(){
        return size;
    }
    public DiskType getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isWireless=" + isWireless +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}
