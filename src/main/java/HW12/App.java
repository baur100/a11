package HW12;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> stringArr = new ArrayList<>();
        stringArr.add("first");
        stringArr.add("second");
        stringArr.add("third");
        stringArr.add("fourth");
        stringArr.add("fifth");
        System.out.println(stringArr);

        stringArr.set(1, "set2elemetn");
        System.out.println(stringArr);

        stringArr.remove(3);
        System.out.println(stringArr);

        String getElement = stringArr.get(2);
        System.out.println(getElement);

        for (String a : stringArr) {
            System.out.println(a);
        }

        int stringArrSze = stringArr.size();
        System.out.println(stringArrSze);

        List<Integer> integerArr = new ArrayList<>();
        integerArr.add(1);
        integerArr.add(2);
        integerArr.add(3);
        integerArr.add(4);
        integerArr.add(5);
        System.out.println(integerArr);

        integerArr.set(1, 22);
        System.out.println(integerArr);

        integerArr.remove(0);
        System.out.println(integerArr);

        Integer getIntElement = integerArr.get(2);
        System.out.println("2 element in array = " + integerArr + "= " + getIntElement);

        for (Integer b : integerArr) {
            System.out.println(b);
        }

        int integerArrSze = stringArr.size();
        System.out.println("Size of integerArrSze = " + integerArrSze);

        Person anton = new Person("Anton", "D", 2001, 1);
        List<Person> arrayOfPersons = new ArrayList<>();
        Person anna = new Person("Anna", "Iv", 2001, 1);
        Person anna1 = new Person("Anna1", "Iv2", 2002, 2);
        Person anna2 = new Person("Anna2", "Iv2", 2002, 3);
        arrayOfPersons.add(anton);
        arrayOfPersons.add(anna);
        arrayOfPersons.add(anna1);
        arrayOfPersons.add(anna2);
        System.out.println(arrayOfPersons);

        System.out.println(arrayOfPersons.size());
        System.out.println(arrayOfPersons.get(1));

        for (Person m: arrayOfPersons) {
            System.out.println(m);
        }


    }
}
