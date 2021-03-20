package HW13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Map<String,String> stringHash = new HashMap<>();
        stringHash.put("One", "1");
        stringHash.put("Two", "2");
        stringHash.put("Three", "3");
        stringHash.put("Four", "4");

        stringHash.remove("One");
        stringHash.replace("Two", "2", "new 2");
        System.out.println("++++++++++++++++++++++++++++");
        for (Map.Entry<String, String> b: stringHash.entrySet()){
            System.out.println(b.getKey() + "=" + b.getValue());
        }

        System.out.println(stringHash);

        Map<Integer,String> intStrMap = new HashMap<>();
        intStrMap.put(1, "One");
        intStrMap.put(2, "Two");
        intStrMap.put(3, "Three");
        intStrMap.put(4, "Four");
        System.out.println("++++++++++++++++++++++++++++");
        intStrMap.remove(4);
        intStrMap.replace(1,"One","New One");
        for (Map.Entry<Integer,String> c: intStrMap.entrySet()){
            System.out.println(c.getKey() + "=" + c.getValue());
        }

        System.out.println(intStrMap);

        Class1 firstElementClass1 = new Class1(1);
        Class1 secondElementClass1 = new Class1(2);
        Class1 thirdElementClass1 = new Class1(3);
        Class1 foursElementClass1 = new Class1(4);

        Class2 firstElementClass2 = new Class2("One");
        Class2 secondElementClass2 = new Class2("Two");
        Class2 thirdElementClass2 = new Class2("Three");
        Class2 foursElementClass2 = new Class2("Four");

        Map<Class1,Class2> c1C2Map1 = new HashMap<>();
        c1C2Map1.put(firstElementClass1,firstElementClass2);
        c1C2Map1.put(secondElementClass1,secondElementClass2);
        c1C2Map1.put(thirdElementClass1,thirdElementClass2);
        c1C2Map1.put(foursElementClass1,foursElementClass2);



        c1C2Map1.remove(firstElementClass1);
        c1C2Map1.replace(secondElementClass1,secondElementClass2,new Class2("new Two"));
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(c1C2Map1.get(secondElementClass1));

        System.out.println(c1C2Map1);

        for (Map.Entry<Class1,Class2> a: c1C2Map1.entrySet()){
            System.out.println(a.getKey() + "=" + a.getValue() );
        }
        System.out.println("++++++++++++++++++++++++++++");


    }
}
