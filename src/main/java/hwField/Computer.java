package hwField;

public class Computer {
    private String model;
    private String color;
    private int year;

    public String info() {return "This is a computer";}
    public void printInfo() {
        System.out.println("The mode is " + model+ "/nThe color is " + color +"/nThe year is " + year );
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getInfo(){
        System.out.println("The Model is " + model + "\nThe Color is " + color + "\nThe year is " + year);
    }
}
