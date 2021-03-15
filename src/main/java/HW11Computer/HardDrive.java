package HW11Computer;

import java.util.Arrays;

public class HardDrive {
    private String nameOfBrands;
    private int size;
    private HddFormFactor[] formFactor;

    public HardDrive(String nameOfBrands, int size, HddFormFactor[] formFactor) {
        this.nameOfBrands = nameOfBrands;
        this.size = size;
        this.formFactor = formFactor;
    }

    public String getNameOfBrands() {
        return nameOfBrands;
    }

    public void setNameOfBrands(String nameOfBrands) {
        this.nameOfBrands = nameOfBrands;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public HddFormFactor[] getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(HddFormFactor[] formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "nameOfBrands='" + nameOfBrands + '\'' +
                ", size=" + size +
                ", formFactor=" + Arrays.toString(formFactor) +
                '}';
    }
}
