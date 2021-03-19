package homework11plus;

public class Storage {
    private String brand;
    private String model;
    private int size;
    private StorageType type;

    public Storage(String brand, String model, int size, StorageType type){
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.type = type;
    }

    public Storage(){}

    public String getModel(){
        return model;
    }

    public String getBrand(){
        return brand;
    }

    public int size(){
        return size;
    }

    public StorageType getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(StorageType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}