package lesson12;

public abstract class Person {
    protected String name;
    protected String lastName;
    public abstract void getInfo();

    public Person(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
