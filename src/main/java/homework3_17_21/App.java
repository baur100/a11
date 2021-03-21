package homework3_17_21;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> animals = new HashMap<>();
        animals.put("Mammals", "Lion");
        animals.put("Fish", "Salmon");
        animals.put("Birds", "Swam");
        animals.put("Insects", "Ant");
        System.out.println(animals);
        animals.replace("Fish", "Sword fish");
        animals.put("Mammals", "Wolve");
        System.out.println(animals);
        animals.put("Reptiles", "Snake");
        animals.replace("Fish", "Sword fish", "Shark");
        System.out.println(animals);
        System.out.println(animals.get("Insects"));
        animals.remove("Mammals");
        System.out.println(animals);

        for (String key : animals.keySet()) {
            System.out.println(key);
        }
        for (String value : animals.values()) {
            System.out.println(value);
        }
        for (Map.Entry<String, String> entry : animals.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        Map<Integer, String> countryEconomic = new HashMap<>();
        countryEconomic.put(1, "USA");
        countryEconomic.put(2, "China");
        countryEconomic.put(3, "Japan");
        countryEconomic.put(4, "Germany");
        System.out.println(countryEconomic);
        countryEconomic.put(5, "United Kingdom");
        System.out.println(countryEconomic);
        countryEconomic.replace(5, "United Kingdom", "India");
        System.out.println(countryEconomic);
        countryEconomic.put(6, "United Kingdom");
        System.out.println(countryEconomic);
        countryEconomic.remove(6);
        System.out.println(countryEconomic);
        System.out.println(countryEconomic.get(4));
        System.out.println(countryEconomic.containsValue("Japan"));

        for (String value : countryEconomic.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> entry : countryEconomic.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }


        Map<City, Team> nhl = new HashMap<>();
        nhl.put(new City("Boston"), new Team("Bruins"));
        nhl.put(new City("Tampa Bay"), new Team("Lighting"));
        nhl.put(new City("New York"), new Team("Rangers"));
        nhl.put(new City("Washington"), new Team("Capitals"));
        System.out.println(nhl);
        nhl.put(new City("New York"), new Team("Islanders"));
        System.out.println(nhl);
        System.out.println(nhl.size());

        for (Team value : nhl.values()) {
            System.out.println(value);
        }
        for (City key : nhl.keySet()) {
            System.out.println(key);
        }
        for (Map.Entry<City, Team> entry : nhl.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}
