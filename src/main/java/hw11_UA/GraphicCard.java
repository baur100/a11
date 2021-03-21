package hw11_UA;

public class GraphicCard {
    private String brand;
    private String model;

    public GraphicCard(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
