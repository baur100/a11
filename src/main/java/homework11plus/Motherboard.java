package homework11plus;

public class Motherboard {
    private String brand;
    private String model;
    private Processor cpu;
    private Memory ram;
    private GraphicCard graphicCard;

    public Motherboard(String brand, String model, Processor cpu, Memory ram, GraphicCard graphicCard){
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.graphicCard = graphicCard;
    }

    public Motherboard(){}

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public Processor getCpu(){
        return cpu;
    }

    public Memory getRam(){
        return ram;
    }

    public GraphicCard getGraphicCard(){
        return graphicCard;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public void setRam(Memory ram) {
        this.ram = ram;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", graphicCard=" + graphicCard +
                '}';
    }
}
