package lesson16;

import java.util.Date;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Person ann = new Person("Ann","Wilson",1990);
        ann.sayHello();
        Person.printGreetings();
        Random random = new Random();
        random.nextInt();
        Date date = new Date();
        date.getTime();
    }

}
;