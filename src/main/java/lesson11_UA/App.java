package lesson11_UA;

public class App {
    public static void main(String[] args) {

        Colors t_shirt = Colors.GREEN;
        // "green" "GREEN" "Green"

        Address address = new Address("123 Elm St", "Gotham City", "CA", "90012");
        School pacific = new School("Pacific Middle School", SchoolType.PUBLIC, SchoolAge.MIDDLE, address.);

        System.out.println(address);


    }
}
