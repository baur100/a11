package lesson14_hw;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Riga");
        cities.add("Kiev");
        cities.add("Ekaterinburg");
        System.out.println(cities);
        cities.add("Riga");
        cities.contains("Kiev");
        System.out.println(cities.contains("Kiev"));
        cities.add("Chicago");
        cities.add("Wheeling");
        for (String city:cities){
            System.out.println(cities);
        }
        cities.remove("Wheeling");
        System.out.println(cities);
    }
}
