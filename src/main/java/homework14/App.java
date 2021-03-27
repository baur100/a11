package homework14;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> neighbors = new HashMap<String, String>();

        neighbors.put("Smiths", "423 Bonnie Jean Dr");
        neighbors.put("Browns", "346 Nancy Dr");
        neighbors.put("Walkers", "410 Gloria Dr" );
        neighbors.put("Rodriguezs", "15442 Patricia Dale Dr");
        neighbors.put("Kims", "311 Laurie Lynn Dr");
        neighbors.replace("Kims", "311 Laurie Lynn Dr", "15442 Becky Lee Dr");
        neighbors.remove("Rodriguezs");
        System.out.println(neighbors.get("Kims"));
        System.out.println(neighbors.keySet());
        System.out.println(neighbors.size());

        for(Map.Entry<String, String> i : neighbors.entrySet()){
            System.out.println(i.getKey() + " : " + i.getValue());
        }

        Map<Integer, String> javaLearning = new HashMap<Integer, String>();
        javaLearning.put(1, "Programming & Algorithms");
        javaLearning.put(2, "Java Fundamentals");
        javaLearning.put(3, "Statements");
        javaLearning.put(4, "Operators");
        javaLearning.put(5, "Loops");
        javaLearning.replace(4, "Operators", "Methods");
        javaLearning.remove(5);
        System.out.println(javaLearning.size());

        for(Map.Entry<Integer, String> i : javaLearning.entrySet()){
            System.out.println("Chapter " + i.getKey() + " - " + i.getValue());
        }

        Map<Owner, Vehicle> driverInfo = new HashMap<Owner, Vehicle>();
        driverInfo.put (new Owner("Joseph"), new Vehicle("Subaru Legacy"));
        Owner eva = new Owner("Eva");
        Vehicle mazda626 = new Vehicle("Mazda 626");
        driverInfo.put(eva, mazda626);
        driverInfo.put(new Owner("Tony"), new Vehicle("Tesla Model 3"));
        driverInfo.put(new Owner("Kevin"), new Vehicle("Ford F150"));
        Owner tofu = new Owner("Tofu");
        driverInfo.put(tofu, new Vehicle("Toyota RAV4"));
        driverInfo.put(new Owner("Jack"), new Vehicle("Volkswagon Beetle"));
        Vehicle hondaCrv = new Vehicle("Honda CR-V");
        driverInfo.replace(eva, mazda626, hondaCrv);
        driverInfo.remove(tofu);
        System.out.println(driverInfo.size());

        for(Map.Entry<Owner, Vehicle> i : driverInfo.entrySet()){
            System.out.println(i.getKey() + ", " + i.getValue());
        }
    }
}