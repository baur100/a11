package lesson12_UA;

public class Rectangle implements Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("I drew a rectangle with length = " + length + " and width + " + width);
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public double getArea() {
        return width*length;
    }
    public final void getInfo() {
        System.out.println("XXXXXXX");
    }
}
