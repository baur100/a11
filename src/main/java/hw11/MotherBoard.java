package hw11;

public class MotherBoard {
    private Memory memory;
    private String brand;
    private String model;
    private GraphicCard graphicCard;
    private Processor cpu;

    public MotherBoard(Memory memory, String brand, String model, GraphicCard graphicCard, Processor cpu) {
        this.memory = memory;
        this.brand = brand;
        this.model = model;
        this.graphicCard = graphicCard;
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public Processor getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "memory=" + memory +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", graphicCard=" + graphicCard +
                ", cpu=" + cpu +
                '}';
    }
}
