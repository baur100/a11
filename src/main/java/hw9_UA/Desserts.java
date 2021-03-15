package hw9_UA;

public class Desserts {
    private String name;
    private String shape;
    private String color;

    public void getDesserts(){
        System.out.println("My favorite dessert is " + name + " in a " + shape + " shape and in the color " + color + ".");
    }

    public Desserts(){
    }

    public Desserts(String name, String shape, String color){
        this.name = name;
        this.shape = shape;
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public String getShape(){
        return this.shape;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

}
