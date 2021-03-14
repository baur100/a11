package lesson12;

public class Rectangle implements Shape{
    protected double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("I draw a rectangle with sides = "+width+" and "+length);
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public double getArea() {
        return width*length;
    }
    public final void getInfo(){
        System.out.println("XXXXXXX");
    }
}
