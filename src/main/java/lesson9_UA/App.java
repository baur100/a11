package lesson9_UA;

public class App { public static void main(String[] args) {
        Person jane = new Person();

        jane.setName("Jane");
        jane.setName("Jane Mary");
        jane.setLastName("Evans");
        jane.setYearOfBirth(1990);

        Person david = new Person("David", "Robertson", 1998);
        System.out.println(david);

        Person james = new Person("James");
        james.setLastName("Wilson");
        james.setYearOfBirth(1997);

        Person mary = new Person("Mary", "Ann");
        mary.setYearOfBirth(1989);

    }
}
