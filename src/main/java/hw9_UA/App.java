package hw9_UA;

public class App {
    public static void main(String[] args) {

        Person lebron = new Person();

        lebron.setFirstName("Lebron");
        System.out.println(lebron.getFirstName());

        lebron.setLastName("James");
        System.out.println(lebron.getLastName());

        lebron.setYearOfBirth(1984);
        System.out.println(lebron.getYearOfBirth());
    }
}
