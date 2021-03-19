package homework11plus;

public class GraphicCard {
    private String brand;
    private String model;

    public GraphicCard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public GraphicCard(){}

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

    @Override
    public String toString() {
        return "GraphicCard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
