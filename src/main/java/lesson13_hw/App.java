package lesson13_hw;

import java.util.ArrayList;

public class App {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Rose");
        list.add("Aster");
        list.add("Irises");
        list.add("Marigold");
        System.out.println(list);
        list.add("Holly");
        System.out.println(list);
        System.out.println(list.size());


        System.out.println(list.get(2));
        list.add("Lily");
        System.out.println(list.contains("Rose"));
        System.out.println(list.indexOf(3));
        System.out.println(list.remove(0));
        System.out.println(list.remove("Rose"));
        System.out.println(list.lastIndexOf(+2));
       /* System.out.println(list.forEach();)*/
        list.set(1,"Berry");
        System.out.println(list);
        list.add(1,"Romashki");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        boolean flower = list.contains("Marigold");
        System.out.println(flower);

       /* for (int i=0;i<list.size();i++
             ) {
            System.out.println(list.get(i));*/
        for (String s: list) {
            System.out.println(s);

        }

        }


    }

