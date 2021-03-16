package lesson9;

public class App {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        Person jane = new Person();

        jane.setName("Jane");
        jane.setName("Jane Mary");
        jane.setLastName("Evans");
        jane.setYearOfBirth(1990);

        Person david = new Person("David","Evans",1998);

        Person james = new Person("James");
        james.setLastName("Wilson");
        james.setYearOfBirth(1997);

        Person mary = new Person("Mary","Ann");
        mary.setYearOfBirth(1989);

    }

}
