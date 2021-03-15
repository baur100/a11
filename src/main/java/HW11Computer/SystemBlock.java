package HW11Computer;

public class SystemBlock {
    private NameOfBrands nameOfBrands;
    private FormFactor formFactor;

    public SystemBlock(NameOfBrands nameOfBrands, FormFactor formFactor) {
        this.nameOfBrands = nameOfBrands;
        this.formFactor = formFactor;
    }

    public NameOfBrands getNameOfBrands() {
        return nameOfBrands;
    }

    public void setNameOfBrands(NameOfBrands nameOfBrands) {
        this.nameOfBrands = nameOfBrands;
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "nameOfBrands=" + nameOfBrands +
                ", formFactor=" + formFactor +
                '}';
    }
}
