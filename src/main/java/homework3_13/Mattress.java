package homework3_13;

public class Mattress {
    private String brand;
    private String type;
    private mattressSize size;

    public Mattress(String brand, String type, mattressSize size) {
        this.brand = brand;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Mattress{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
