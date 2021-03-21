package hw11;

public class Memory {
    private String brand;
    private String model;
    private String size;

    public Memory(String brand, String model, String size){
        this.brand = brand;
        this.model = model;
        this.size = size;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
