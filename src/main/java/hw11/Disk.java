package hw11;

public class Disk {    private String brand;
    private String model;
    public boolean isWireless;
    private int size;
    private DiskType type;

    public Disk(String brand, String model, boolean isWireless, int size, DiskType type) {
        this.brand = brand;
        this.model = model;
        this.isWireless = isWireless;
        this.size = size;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public int getSize() {
        return size;
    }

    public DiskType getType() {
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
