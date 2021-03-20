package lesson11_UA;

public class App {
    public static void main(String[] args) {

        Colors t_shirt = Colors.GREEN;
        // "green" "Green" " GREEN"
        Colors snickers = Colors.BLUE;
        System.out.println(snickers);

        Address address = new Address("123 Elm St", "Gotham", States.CA, "91325");
        School pacific = new School("Pacific Middle School", SchoolType.PUBLIC, SchoolAge.MIDDLE, address);
        System.out.println(pacific);


        // Composition : getter chain.
        String street = pacific.getAddress().getStreet1();
        System.out.println(street);


    }
}
