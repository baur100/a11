package homework3_15;

public class Printer {
    private String type;
    private String brand;
    private String color;

    public Printer(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
