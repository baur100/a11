package lesson10_UA;

public class App {
    public static void main(String[] args) {
        Person ann = new Person("Ann", "Davidson", 1989);
        System.out.println(ann.toString());

        String[]subj = {"Math", "Law", "Biology", "History"};

        Student peter = new Student("Peter", "Pan", 1989, "Math", subj);
        System.out.println(peter);
        System.out.println(peter.getFirstName());
    }
}
