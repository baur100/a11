package homework13;

import lesson13.Person;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //String ArrayList
        List<String> wishlist = new ArrayList<String>();
        wishlist.add("Motherboard");
        wishlist.add("RAM");
        wishlist.add("videocard");
        wishlist.add("soundcard");
        wishlist.add("powersupply");
        wishlist.add("desktop case");
        wishlist.remove("soundcard");
        wishlist.set(4, "videocard2");
        System.out.println(wishlist.get(0));
        System.out.println("Wishlist size: " + wishlist.size());
        for (String i : wishlist){
            System.out.println(i);
        }
        //Interger ArrayList
        List<Integer> luckyNumbers = new ArrayList<Integer>();
        luckyNumbers.add(33);
        luckyNumbers.add(48);
        luckyNumbers.add(99);
        luckyNumbers.add(58);
        luckyNumbers.remove(0);
        luckyNumbers.set(0, 7);
        System.out.println(luckyNumbers.get(1));
        System.out.println("# of lucky number sets: " + luckyNumbers.size());
        for (Integer i : luckyNumbers){
            System.out.println(i);
        }

        //Custom class ArrayList
        List<Shopper> shoppers = new ArrayList<>();
        shoppers.add(new Shopper("John"));
        shoppers.add(new Shopper("Lucy"));
        shoppers.add(new Shopper("Zack"));
        Shopper sylvia = new Shopper("Sylvia");
        shoppers.add(sylvia);
        System.out.println(shoppers.get(3).getName());
        System.out.println(shoppers.size());
        shoppers.set(1, new Shopper("Becky"));
        shoppers.remove(0);
        System.out.println(shoppers.get(1).getName());
        for (Shopper i : shoppers){
            System.out.println(i);
        }
        // // Failed to display name of the shopper
        //for (Shopper i : shoppers){
        //    System.out.println(shoppers.get(i).getName());
        //}
    }
}