package homework11plus;

public class Processor {
    private String name;
    private String model;

    public Processor(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Processor(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
