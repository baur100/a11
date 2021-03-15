package HW11Computer;

public class Mouse {
    private NameOfBrands nameOfBrands;
    private boolean isWireless;

    public Mouse(NameOfBrands nameOfBrands, boolean isWireless) {
        this.nameOfBrands = nameOfBrands;
        this.isWireless = isWireless;
    }

    public NameOfBrands getNameOfBrands() {
        return nameOfBrands;
    }

    public void setNameOfBrands(NameOfBrands nameOfBrands) {
        this.nameOfBrands = nameOfBrands;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "nameOfBrands=" + nameOfBrands +
                ", isWireless=" + isWireless +
                '}';
    }
}
