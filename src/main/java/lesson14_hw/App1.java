package lesson14_hw;

import hw11.SystemBlock;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String,String> books= new HashMap<>();
        books.put("Cinderella"," Christian Andersen");
        books.put("The Town Musicians of Bremen","Brothers Grimm");
        books.put("The Steadfast Tin Soldier","Christian Andersen");
        books.put("Eugene Onegin","Alexander Pushkin");
        System.out.println(books);

        System.out.println(books.get("Cinderella"));



        Map<Integer,String> libraryList= new HashMap<>();
        libraryList.put(0,"The British Library");
        libraryList.put(1,"National Library of Russia");
        libraryList.put(2,"Bayerische Staatsbibliothek");
        libraryList.put(3,"Beinecke Rare Book & Manuscript Library");
        System.out.println(libraryList.get(1));

        Collection<String> author=books.values();
        for(String a:author){
            System.out.println(a);
        }

        for(String a:books.values()){
            System.out.println(a);
        }
        for (Map.Entry<String,String> a:books.entrySet()){
            System.out.println(a.getKey() +"="+ a.getValue());
        }


    }
}
