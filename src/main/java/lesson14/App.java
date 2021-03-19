package lesson14;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) { // uniq values
        Set<String> colors=new HashSet<>();
        colors.add("Red");
        System.out.println(colors);
        colors.add("Blu");
        System.out.println(colors);
        colors.add("Blu");                //don't duplicate value
        System.out.println(colors);
        System.out.println(colors.contains("Red"));
        colors.add("Yellow");
        colors.add("Green");

        for(String v:colors){
            System.out.println(v);
        }
        colors.remove("Green");

    }
}
