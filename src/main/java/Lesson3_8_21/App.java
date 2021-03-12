package Lesson3_8_21;

public class App {
    public static void main(String[] args) {
        Person anna =new Person();
        anna.name = "Anna";
        anna.lastname = "Smith";
        anna.birthOfBirth = 1999;

        anna.work(10);

        Person john = new Person();
        john.name = "John";
        john.lastname = "Fitch";
        john.birthOfBirth = 1995;

        john.work(15);

        Person maria = new Person();
        maria.name = "Maria";
        maria.lastname = "Walsh";
        maria.birthOfBirth = 1997;

        maria.work(12);

        System.out.println("First name: "+anna.name+", Last name: "+ anna.lastname+", Date of Birthday: "+ anna.birthOfBirth);
    }
}
