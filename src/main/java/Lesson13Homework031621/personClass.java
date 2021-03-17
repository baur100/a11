package Lesson13Homework031621;

public class personClass {
    private String name;

    public personClass(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //returns the string for printing.
    @Override
    public String toString() {
        return  "name: " + name ;
    }
} //end of class
