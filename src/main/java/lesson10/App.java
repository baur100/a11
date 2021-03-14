package lesson10;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Person ann = new Person("Ann","Davidson",1989);
        System.out.println(ann.toString());

        String[]subj = {"Math","Law","Biology","History"};

        Student peter = new Student("Peter","Hamilton",2002,"Math",subj);

        System.out.println(peter);
        System.out.println(peter.getName());

        String str = new String("Hello, Students");
        System.out.println(str.toUpperCase(Locale.ROOT));
    }
}
