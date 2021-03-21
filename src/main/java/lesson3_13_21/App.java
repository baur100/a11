package lesson3_13_21;

public class App {
    public static void main(String[] args) {
        Colors shirt = Colors.GREEN;
//    "green" "GREEN" "Green"

        Address address= new Address("123 Elm street","Newton city",States.MA,"02454");
        School newton= new School("Newton Middle School",SchoolType.PUBLIC,SchoolAge.MIDDLE,address);
        System.out.println(newton);

        Shirt shirt1= new Shirt("Shirt",Colors.GREY,Size.M);
        System.out.println(shirt1);
    }
}
