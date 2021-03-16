package hw10AF18;

public class HeadsetVR {
    protected VrBrand vrBrand;
    protected String model;
    protected int yearOfRelease;
public HeadsetVR(){};
    public HeadsetVR(VrBrand vrBrand, String model, int yearOfRelease) {
        this.vrBrand = vrBrand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    public VrBrand getVrBrand() {
        return vrBrand;
    }

    public void setVrBrand(VrBrand vrBrand) {
        this.vrBrand = vrBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
