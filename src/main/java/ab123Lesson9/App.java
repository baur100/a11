package ab123Lesson9;

public class App {
    public static void main(String[] args) {
        //rules of encapsulation: you can get access only through methods
        //one method should set the value and one should get the value
        Person jane = new Person();
        jane.setName("Jane");
        jane.setName("Jane Mary");
        System.out.println(jane.getName());

        //constructor sets everything in one line
        Person david = new Person("David", "Evans", 1998);
    }
}
