package lesson12_UA;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Shape circle1 = new Circle(6);

        Rectangle rectangle = new Rectangle(3, 8);
        Shape rectangle1 = new Rectangle(4, 2);

        Square square = new Square(8);
        Rectangle square1 = new Square(7);
        Shape square2 = new Square(3);

        Shape[] shapes = {circle, circle1, rectangle, rectangle1, square, square1, square2};

        for (Shape shape:shapes){
            shape.draw();
        }

    }
}
