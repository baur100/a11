package HW11Computer;

public class PowerSupplie {

    private NameOfBrands nameOfBrands;
    private String wattage;

    public PowerSupplie(NameOfBrands nameOfBrands, String wattage) {
        this.nameOfBrands = nameOfBrands;
        this.wattage = wattage;
    }

    public NameOfBrands getNameOfBrands() {
        return nameOfBrands;
    }

    public void setNameOfBrands(NameOfBrands nameOfBrands) {
        this.nameOfBrands = nameOfBrands;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "PowerSupplie{" +
                "nameOfBrands=" + nameOfBrands +
                ", wattage='" + wattage + '\'' +
                '}';
    }
}
