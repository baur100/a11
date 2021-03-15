package lesson12;

public class Square extends Rectangle{
    public Square(double width) {
        super(width, width);
    }
    @Override
    public void draw(){
        System.out.println("I draw Square with side = "+width);
    }
//    @Override
//    public void getInfo(){
//        // Cant override final method
//    }
}
