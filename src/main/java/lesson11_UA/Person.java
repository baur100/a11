package lesson11_UA;

public class Person {
    private Name name;
    private int year;

    public Person(Name name, int year) {
        this.name = name;
        this.year = year;
    }

    public Name getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
