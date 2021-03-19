package hw13AF18;

public class Tea {
    private String name;
    private int oz;
    private Country manufacture;

    public Tea(String name, int oz, Country manufacture) {
        this.name = name;
        this.oz = oz;
        this.manufacture = manufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOz() {
        return oz;
    }

    public void setOz(int oz) {
        this.oz = oz;
    }

    public Country getManufacture() {
        return manufacture;
    }

    public void setManufacture(Country manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Tea: " + name +
                ". Oz= " + oz +
                ". Manufacture= " + manufacture;
    }
}
