package hw11;

public class Processor {
    private String brand;
    private String model;
    private double cpuSpeed;
    private int cacheSize;

    public Processor(String brand, String model, double cpuSpeed, int cacheSize) {
        this.brand = brand;
        this.model = model;
        this.cpuSpeed = cpuSpeed;
        this.cacheSize = cacheSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cpuSpeed=" + cpuSpeed +
                ", cacheSize=" + cacheSize +
                '}';
    }
}
