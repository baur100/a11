package hw9_UA;

public class Vegetables {
    private String name;
    private String color;
    private String shape;

    public void getVegetableDetails(){
        System.out.println("Vegetables are very healthy! Some healthy vegetables are " + name + ", which grow into an " + shape + " shape, and are " + color + "color.");
    }

    public Vegetables(){
    }

    public Vegetables(String name, String color, String shape){
        this.name = name;
        this.color = color;
        this.shape = shape;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public String getShape(){
        return this.shape;
    }

}

