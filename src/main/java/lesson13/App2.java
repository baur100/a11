package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Blue");
        colors.add("Pink");
//        System.out.println(colors);

        colors.remove("Blue");
//        System.out.println(colors);

        List<Person> staff = new ArrayList<>();
        staff.add(new Person("Anna", "Jons", 19));
        staff.add(new Person("Peter", "Fish", 11));
        Person david = new Person("David", "Brown", 13);

        staff.add(david);
        for(Person s:staff) {
            System.out.println(s);
        }
        double x=0;
        for(Person s:staff) {
            x=x+s.getYear();

//            System.out.println(s.getYear());
        }x=x/staff.size();
//        System.out.println(x);
//        System.out.println(staff.get(1).getName());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        for(int n:numbers){
//            System.out.println(n);
        }
//        int i = 10;
//        int j = 12;
//        i+=++j;
//        System.out.println(i);
//
//        double d1 = Double.NaN
//        double d2 = d1;
//
//        System.out.println(d1);
//        System.out.println(d2);
//
//        if(d1 == d2)
//            System.out.println("Equal");
//        else
//            System.out.println("Not Equal");
        int i = 010;
        int j = 25;

//
//        System.out.println(i);


    }

}
