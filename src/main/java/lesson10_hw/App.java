package lesson10_hw;

import lesson10.Person;
import lesson10.Student;

import java.util.Locale;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Manager mia  = new Manager("Mia","Paderina",1989, 25);
        System.out.println(mia.toString());



        System.out.println(mia);
        System.out.println(mia.getName());

        String str = new String("Good JOB!!!! Hurray!!!!");
        System.out.println(str.toUpperCase(Locale.ROOT));


    }
}
