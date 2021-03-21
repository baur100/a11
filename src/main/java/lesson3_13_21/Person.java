package lesson3_13_21;

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

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", year=" + year +
                '}';
    }
}
