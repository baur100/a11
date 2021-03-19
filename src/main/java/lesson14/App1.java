package lesson14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {                //key must be unique
        Map<String,String> capitals=new HashMap<>();        //key is index, without numbers
        capitals.put("Ottava","Canada");                    //key can be null
        capitals.put("London","Great Britain");
        capitals.put("Berlin","Germany");
        capitals.put("Vienna","Austria");
        capitals.put("Canbera","Australia");
        capitals.put("London","Scotland");
        System.out.println(capitals);
        System.out.println(capitals.get("London"));
        capitals.put(null,"Pacific ocaen");

        Collection<String> countries=capitals.values();   // can print just values from HashMap capitals
        for(String v: countries){
            System.out.println(v);
        }
        Set<String> cities=capitals.keySet();               // can print just keys from HashMap capitals
        for(String x: cities){
            System.out.println(x);
        }
    }
}
