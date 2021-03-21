package homework3_13;

public class Slippers implements AmericanShoesSize{
    private String type;
    private String brand;
    private String color;
    private double size;
    private double price;

    public Slippers(String type, String brand, String color, double size, double price) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.size=size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Slippers{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    @Override
    public void useAmericanSize() {
        System.out.println("I use American Shoes size");
    }
}
