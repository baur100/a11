package hw13AF18;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> personalData = new HashMap<>();
        personalData.put("Morozova", "Elena");
        personalData.put("Ivanova", "Anna");
        personalData.put("Sidodorov", "Ivan");
        personalData.put("Komolov", "Pavel");

        personalData.replace("Morozova","Ksenia");
        System.out.println(personalData);

        Map<Integer, String> id = new HashMap<>();
        id.put(111, "Smirnov Sasha");
        id.put(112, "Petrova Yulia");
        id.put(113, "Smirnov Nikita");
        id.put(114, "Fedotova Alisa");

        id.remove(114);
        System.out.println(id);

        //HashMap<Class><Class>
        Tea tea1=new Tea("Black tea", 2, Country.INDIA);
        Tea tea2=new Tea("Green tea", 2, Country.JAPAN);
        Tea tea3=new Tea("GreenField", 3, Country.INDONESIA);
        Tea tea4=new Tea("SourSup", 3, Country.CHINA);

        Map<Tea, Dessert> coffeeBreak = new HashMap<>();
        coffeeBreak.put(tea1, new Dessert("Napoleon", "Cake", 25));
        coffeeBreak.put(tea2, new Dessert("Cheesecake", "Cake", 30));
        coffeeBreak.put(tea3, new Dessert("Milk river", "Ice-cream", 28));
        coffeeBreak.put(tea4, new Dessert("Crackers", "Cookies", 22));

        System.out.println(coffeeBreak.get(tea3));
        for (Map.Entry<Tea,Dessert> xxx: coffeeBreak.entrySet()){
            System.out.println(xxx.getKey()+"="+xxx.getValue());
        }
    }
}
