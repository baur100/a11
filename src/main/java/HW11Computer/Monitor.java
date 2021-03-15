package HW11Computer;

public class Monitor {
    private NameOfBrands nameOfBrands;
    private String size;

    public Monitor(NameOfBrands nameOfBrands, String size) {
        this.nameOfBrands = nameOfBrands;
        this.size = size;
    }

    public NameOfBrands getNameOfBrands() {
        return nameOfBrands;
    }

    public void setNameOfBrands(NameOfBrands nameOfBrands) {
        this.nameOfBrands = nameOfBrands;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "nameOfBrands=" + nameOfBrands +
                ", size='" + size + '\'' +
                '}';
    }
}
