package hw11;

public class Memory {
    private String brand;
    private String model;
    private String memoryType;
    private int memoryCapacity;

    public Memory(String brand, String model, String memoryType, int memoryCapacity) {
        this.brand = brand;
        this.model = model;
        this.memoryType = memoryType;
        this.memoryCapacity = memoryCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", memoryCapacity=" + memoryCapacity +
                '}';
    }
}
