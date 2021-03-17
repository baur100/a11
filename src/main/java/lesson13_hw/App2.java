package lesson13_hw;

import java.util.ArrayList;

public class App2 {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("sofa");
        list.add("chair");
        list.add("table");
        list.add("mirror");
        System.out.println(list);
        list.add("vase");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.contains("chair"));
        boolean furniture  = list.contains("mirror");
        for (String s:list) {
          System.out.println(s);

          /*Test test1= new Test();
          test1.name= "Ola";
          System.out.println("Ola");*/

        }
    }



    }
