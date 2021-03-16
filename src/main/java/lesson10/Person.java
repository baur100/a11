package lesson10;

public class Person {
    private String name;
    private String secondName;
    private int yearOfBirth;

    public Person(){};
    public Person(String name, String secondName, int yearOfBirth) {
        this.name = name;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
