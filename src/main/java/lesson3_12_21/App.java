package lesson3_12_21;

public class App {
    public static void main(String[] args) {
        Person ann = new Person("Anna","Davidson",1989);
        System.out.println(ann);

        String[] subj={"Math","Law","Biology","History"};

        Student peter=new Student("Peter","Johnson",2002,"Math",subj);

        System.out.println(peter);
    }
}
