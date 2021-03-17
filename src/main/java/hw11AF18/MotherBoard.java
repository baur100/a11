package hw11AF18;

public class MotherBoard {
    private Memory memory;
    private String brand;
    private String model;
    private GraphicCard graphicCard;
    private Processor cpu;

    public MotherBoard(){};
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

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "MotherBoard " +
                "\nmemory=" + memory +
                "\nbrand='" + brand +
                "\nmodel='" + model +
                "\ngraphicCard=" + graphicCard +
                "\ncpu=" + cpu;
    }
}
