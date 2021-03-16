package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Blue");
        colors.add("Pink");
        System.out.println(colors);

        colors.remove("Blue");
        System.out.println(colors);

        List<Person> staff = new ArrayList<>();
        staff.add(new Person("Anna"));
        staff.add(new Person("Peter"));
        Person david = new Person("David");
        staff.add(david);
        System.out.println(staff.get(1).getName());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);


    }
}
