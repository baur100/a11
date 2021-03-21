package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Homework14 {
    public static void main(String[] args) {
        Map<String, String> Team_Cities = new HashMap<>();
        Team_Cities.put("Chicago", "Bulls");
        Team_Cities.put("LA", "Lakers");
        Team_Cities.put("Dallas", "Mavericka");
        Team_Cities.put("NY", "Knicks");
        Team_Cities.put("OKC", "Thunder");

        Team_Cities.remove("Dallas");

        for (Map.Entry<String, String> e : Team_Cities.entrySet()) {
            System.out.println(e.getKey() + "'s home team is " + e.getValue());
        }



        System.out.println("********************************");

        Map<Integer, String> Roster = new HashMap<>();
        Roster.put(122, "John");
        Roster.put(133, "Jason");
        Roster.put(155, "Jerry");
        Roster.put(177, "Jenny");

        Roster.replace(177,"J-Lo");

        for (Map.Entry<Integer, String> e : Roster.entrySet()) {
            System.out.println("Jersey #" + e.getKey() + " belongs to " + e.getValue());
        }

        Map<Customer, Pizza> order = new HashMap<>();
        Customer paul = new Customer(111, "Paul");
        Customer pam = new Customer(121, "Pam");
        Customer sam = new Customer(232, "Sam");
        Customer sally = new Customer(333, "Sally");

        Pizza small = new Pizza(2, "Small");
        Pizza medium = new Pizza(3, "Medium");
        Pizza large = new Pizza(5, "large");
        Pizza xLarge = new Pizza(7, "XL");

        order.put(paul, small);
        order.put(pam, medium);
        order.put(sam, xLarge);
        order.put(sally, large);

        System.out.println("********************************");
        for (Customer c : order.keySet()) {
            System.out.println(c);
        }

        System.out.println("********************************");
        for (Pizza pz : order.values()) {
            System.out.println(pz);
        }

    }
}