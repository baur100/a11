package lesson14_UA;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        System.out.println(colors);
        colors.add("Blue");
        System.out.println(colors);
        colors.add("Blue");
        System.out.println(colors);
        System.out.println(colors.contains("Red"));
        colors.add("Yellow");
        colors.add("Green");

        for (String color : colors){
            System.out.println(color);
        }

        colors.remove("Yellow");
        System.out.println(colors);

        System.out.println(colors);





    }
}
