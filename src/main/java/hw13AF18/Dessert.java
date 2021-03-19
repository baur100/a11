package hw13AF18;

public class Dessert {
    private String name;
    private String type;
    private int oz;

    public Dessert(String name, String type, int oz) {
        this.name = name;
        this.type = type;
        this.oz = oz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOz() {
        return oz;
    }

    public void setOz(int oz) {
        this.oz = oz;
    }

    @Override
    public String toString() {
        return "Dessert: " + name +
                ".Type= " + type +
                ". Oz= " + oz;
    }
}
