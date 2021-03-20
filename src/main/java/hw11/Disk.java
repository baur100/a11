package hw11;

<<<<<<< HEAD
public class Disk {
    private String model;
    public boolean isWireless;
    private int size;
    private DickType type;

    public Disk(String model, boolean isWireless, int size, DickType type) {
        this.model = model;
        this.isWireless = isWireless;
        this.size = size;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public DickType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "model='" + model + '\'' +
                ", isWireless=" + isWireless +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
=======
public class Disk {    private String brand;
    private String model;
    public boolean isWireless;
    private int size;
    private DiskType type;
    // Add constructors, getters, toString;
>>>>>>> origin/main
}
