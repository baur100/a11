package hwEnum;

public class Animals {
    private String name;
    private AnimalType type;

    public Animals(String name, AnimalType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }
}
