package hw13;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Character> list3 = new ArrayList<Character>();
        list.add("Cheese");
        list.add("Potato");
        list.add("Tomato");
        list.add("Cheetos");

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        list3.add('a');
        list3.add('b');
        list3.add('c');
        list3.add('d');

        //methods
        list.add(1,"honey");
        list2.set(0,2);
        list3.remove(2);
        String cheetos = list.get(3);

        list.forEach(n ->System.out.println(n));
        System.out.println(list2);


    }
}
