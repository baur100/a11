package lesson3_10_21;

public class App {
    public static void main(String[] args) {
        Person jane = new Person();

        jane.setName("Jane");
        jane.setName("Jane Mary");
        System.out.println(jane.getName());

        jane.setLastname("Wilson");
        System.out.println(jane.getLastname());
        jane.setYearOfBirth(1982);
        System.out.println(jane.getYearOfBirth());


    }
}
