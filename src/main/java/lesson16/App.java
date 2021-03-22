package lesson16;

public class App {
    public static void main(String[] args) {
        //Static -
        Person pr1=new Person("Anna","Fomina");
        pr1.sayHello();
        Person.printGreetings();   //class->static function

    }
}
