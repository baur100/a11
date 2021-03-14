package ab123Lesson10;

import ab123lesson8.Person8;

public class App {
    public static void main(String[] args) {
        //create an instance of Person name it mike
        Person mike = new Person("Ann", "Davidson", 1989);
        System.out.println(mike);

        String[]subj= {"Math", "Law", "Biology", "History"};

        Student peter = new Student( "Peter", "Hamilton", 2002, "Math", subj);

        Teacher sue = new Teacher("Sue", "Murphy", 1955, "History");

        System.out.println(peter);
        System.out.println(peter.getName());
        System.out.println(sue);
    }
}
