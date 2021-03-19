package lessonHw13;

import java.util.ArrayList;
import java.util.List;

//Create 3 ArrayList - String, Integer and some Custom class
//Add 4+ elements to each List
// use methods add/set/remove/get/foreach and etc

public class AppHomework13 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Subaru");
        cars.add("BMW");
        System.out.println("");
        System.out.println("The cars in the dealership are:");
        System.out.println(cars);

        System.out.println("");
        String myCar = cars.get(3);
        System.out.println("I bought a " + myCar);
        System.out.println("");

        cars.remove("BMW");
        System.out.println("The cars left in the dealership are:");
        System.out.println(cars);
        System.out.println("****************************");


        List<Integer> Mortgages = new ArrayList<Integer>();
        Mortgages.add(100000);
        Mortgages.add(225000);
        Mortgages.add(350000);
        Mortgages.add(500000);

        System.out.println("The bank's mortgages are: " );
        for (Integer m: Mortgages)
              {
                  System.out.println(m);
              }

        System.out.println("****************************");

        List<Dog> kennel = new ArrayList<>();
        Dog maltese = new Dog();
        maltese.setBreed("Maltese");
        maltese.setAge(2);
        maltese.setWeight(18) ;
        kennel.add(maltese);

        kennel.add(new Dog("bulldog", 8, 50));
        kennel.add(new Dog("labrador",2, 75 ));
        kennel.add(new Dog("miniature poodle", 5,15));

        kennel.get(0).printDogInfo();
        System.out.println("****************************");

        kennel.remove(maltese);

        System.out.println("The dogs left in the kennel are:");
        for (Dog k: kennel)
        {
           System.out.println(k.getBreed());
        }


    }
}