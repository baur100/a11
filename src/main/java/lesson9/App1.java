package lesson9;

import lesson9.hw.Garden;
import lesson9.hw.Student;

public class App1 {
    public static void main (String[] args) {
        /*Person jane = new Person();
        jane.setName("Jane");
        jane.setName("Jane Mary");
        System.out.println(jane.getName());
        jane.setYearOfBirth(1990);*/

        Student daniel=new Student();


        daniel.setName("Daniel");
        System.out.println(daniel.getName());

        daniel.setLastName("Paderin");
        System.out.println(daniel.getLastName());

        daniel.setAge(11);
        System.out.println(daniel.getAge());

        daniel.setGrade(5);
        System.out.println(daniel.getGrade());

        Garden tree = new Garden();

        tree.setTreeName("Apple");
        tree.setFruitKind("tree fruit");
        tree.setTreeAge(26);
        tree.setAmountOfTree(100);

        System.out.println(tree.getTreeName());
        System.out.println(tree.getFruitKind());
        System.out.println(tree.getTreeAge());
        System.out.println(tree.getAmountOfTree());

       /* Berry strawberry = new Berry();

        strawberry.setName("Strawberry");
        strawberry.setColor("Red");
        strawberry.setTaste("Sweet");
        strawberry.weightInBasket(25);

        System.out.println(strawberry.getName());
        System.out.println(strawberry.getColor());
        System.out.println(strawberry.getTaste());
        System.out.println(strawberry.getweightInBasket());
*/








    }
}
