package hw11AF18;

public class Disk {
    private String brand;
    private String model;
    private int size;
    private DiskType type;

public Disk(){};
    public Disk(String brand, String model, int size, DiskType type) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DiskType getType() {
        return type;
    }

    public void setType(DiskType type) {
        this.type = type;
    }
}
