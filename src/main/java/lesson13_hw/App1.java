package lesson13_hw;

public class App1 {
    public static void main (String[] args){
        int book1=3;
        Integer books=10+1+87+8787;

        double z = 3.5;
        Double z1 = 3.5;

        char t = 't';
        Character t1 = 't';

        boolean a = true;
        Boolean a1= true;

        System.out.println(book1);

        Human person = new Human();
        person.name = "ABC";
        Human person2 = person;
        person.name= "Natasha";
        System.out.println(person2.name);

        int f= books.shortValue();
        System.out.println(f);

        books=7;
        book1=books;

        System.out.println(books);



    }
}
