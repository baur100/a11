package lesson13_UA;

public class App {
    public static void main(String[] args) {
//        int a = 5;
//        Integer a1 = 5;
//
//        double b = 7.5;
//        Double b1 = 7.5;
//
//        char c = 'c';
//        Character c1 = 'c';
//
//        boolean d = true;
//        Boolean d1 = true;
//
//        short x = 3;
//        Short x1 = 3;
//
//        Person student = new Person();
//        student.name = "Anna";
//
//        Person student2 = student;
//
//        student.name = "Peter";
//
//        System.out.println(student2.name);
//
//        int z = a;
//        a = 10;
//        System.out.println(z);


        Person manager = new Person("Boris");
        Person janitor = manager;

        janitor.setName("Allen");

        int a = 5;
        int z = a;
        a = 10;






    }
}
