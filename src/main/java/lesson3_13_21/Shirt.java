package lesson3_13_21;

public class Shirt {
    private String name;
    private Colors colors;
    private Size size;

    public Shirt(String name, Colors colors, Size size) {
        this.name = name;
        this.colors = colors;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "name='" + name + '\'' +
                ", colors=" + colors +
                ", size=" + size +
                '}';
    }
}
