package hw11;

public class GraphicCard {
    private String brand;
    private String model;
    private String cardMemoryType;
    private int ramCapacity;

    public GraphicCard(String brand, String model, String cardMemoryType, int ramCapacity) {
        this.brand = brand;
        this.model = model;
        this.cardMemoryType = cardMemoryType;
        this.ramCapacity = ramCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCardMemoryType() {
        return cardMemoryType;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cardMemoryType='" + cardMemoryType + '\'' +
                ", ramCapacity=" + ramCapacity +
                '}';
    }
}
