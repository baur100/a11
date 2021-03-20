package lesson16;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        setYear(year);
    }

    public static void printGreetings(){
        System.out.println("Hello");
        hi();

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<1900 || year >2021){
            throw new IllegalArgumentException("Wrong age");
        }
        this.year = year;
    }

    private static void hi() {
        System.out.println("hi");
    }

    public void sayHello(){
        System.out.println("Hello");
        hi();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
