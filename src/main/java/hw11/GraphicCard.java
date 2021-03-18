package hw11;

public class GraphicCard {
    private String brand;
    private String gigs;

    public GraphicCard(String brand, String gigs) {
        this.brand = brand;
        this.gigs = gigs;
    }

    public String getBrand() {
        return brand;
    }

    public String getGigs() {
        return gigs;
    }
}
