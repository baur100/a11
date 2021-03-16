package lesson13;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {
        // String[] list = new String[10];
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Pineapple");
        list.add("Strawberry");
        System.out.println(list);
        list.add("Orange");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.get(1));
        list.add("Lemon");
        System.out.println(list.size());
        String removedElement = list.set(3,"Peach");
        System.out.println(list);
        System.out.println(removedElement);

        // Dynamic size
        // We use methods
        // Encapsulation

        list.add(1,"Starfruit");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        boolean xx = list.contains("Apple1");
        System.out.println(xx);

//        for (int i = 0; i< list.size(); i++){
//            System.out.println(list.get(i));
//        }
        for (String s : list) {
            System.out.println(s);
        }







    }
}
