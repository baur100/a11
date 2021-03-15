package lesson11;

public class App {
    public static void main(String[] args) {
        Colors t_shirt = Colors.GREEN;
        // "green" "GREEN" "Green"
        Colors[]colors = {Colors.BLUE,Colors.BLUE,Colors.RED,Colors.GREEN,Colors.RED,Colors.GREY};
        Colors snickers =Colors.BLUE;


        Address address = new Address("123 Elm street","Gotham city",States.CA,"91878");
        School pacific = new School("Pacific Middle School",SchoolType.PUBLIC,SchoolAge.MIDDLE,address);
        System.out.println(pacific);
        String streetAddress = pacific.getAddress().getStreet1();

    }
}
