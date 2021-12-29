package lesson14;

import java.util.*;

public class App1 {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        capitals.put("Ottawa","Canada");
        capitals.put("London","Great Britain");
        capitals.put("Berlin","Germany");
        capitals.put("Vienna","Austria");
        capitals.put("Canbera","Australia");
//        capitals.put("London","Scotland");

        System.out.println(capitals);
        capitals.put("Bonn","Germany");
        System.out.println(capitals);

        System.out.println(capitals.get("London"));
        capitals.put(null,"Pacific Ocean");

        capitals.remove("Bonn");
        System.out.println(capitals);

//        Map<Integer,String> shoppingList = new HashMap<>();
//        shoppingList.put(0,"Bread");
//        shoppingList.put(1,"Apples");
//        shoppingList.put(2,"Kale");
//
//        System.out.println(shoppingList.get(0));
//        System.out.println(shoppingList.get(2));



//        Collection<String> countries = capitals.values();
//        for (String c : countries){
//            System.out.println(c);
//        }
//        Set<String> cities = capitals.keySet();
//        for (String c : cities) {
//            System.out.println(c);
//        }
//        for (String c : capitals.values()){
//            System.out.println(c);
//        }
//        for (String c : capitals.keySet()){
//            System.out.println(c);
//        }

        for (Map.Entry<String,String> e: capitals.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
        }
        Map<Fruit,Person> favorite = new HashMap<>();
        favorite.put(new Fruit(),new Person());

//        System.out.println(favorite);


    }
}
