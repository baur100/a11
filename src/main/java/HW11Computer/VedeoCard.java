package HW11Computer;

public class VedeoCard {
    private NameOfBrands nameOfBrands;
    private GraphicsProcessing graphicsProcessing;
    private VedeoMemory vedeoMemory;

    public VedeoCard(NameOfBrands nameOfBrands, GraphicsProcessing graphicsProcessing, VedeoMemory vedeoMemory) {
        this.nameOfBrands = nameOfBrands;
        this.graphicsProcessing = graphicsProcessing;
        this.vedeoMemory = vedeoMemory;
    }

    public NameOfBrands getNameOfBrands() {
        return nameOfBrands;
    }

    public void setNameOfBrands(NameOfBrands nameOfBrands) {
        this.nameOfBrands = nameOfBrands;
    }

    public GraphicsProcessing getGraphicsProcessing() {
        return graphicsProcessing;
    }

    public void setGraphicsProcessing(GraphicsProcessing graphicsProcessing) {
        this.graphicsProcessing = graphicsProcessing;
    }

    public VedeoMemory getVedeoMemory() {
        return vedeoMemory;
    }

    public void setVedeoMemory(VedeoMemory vedeoMemory) {
        this.vedeoMemory = vedeoMemory;
    }

    @Override
    public String toString() {
        return "VedeoCard{" +
                "nameOfBrands=" + nameOfBrands +
                ", graphicsProcessing=" + graphicsProcessing +
                ", vedeoMemory=" + vedeoMemory +
                '}';
    }
}
