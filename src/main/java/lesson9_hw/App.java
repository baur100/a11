package lesson9_hw;


public class App {

    public static void main(String[] args) {

            Student daniel = new Student("Natalja", "Lukasevich", 10, 5);

            daniel.setName("Daniel");
            System.out.println(daniel.getName());

            daniel.setLastName("Paderin");
            System.out.println(daniel.getLastName());

            daniel.setAge(11);
            System.out.println(daniel.getAge());



            daniel.setGrade(5);
            System.out.println(daniel.getGrade());

            Garden tree = new Garden("Apple","tree fruit",25,100);

            /*tree.setTreeName("Apple");
            tree.setFruitKind("tree fruit");
            tree.setTreeAge(26);
            tree.setAmountOfTree(100);*/


            System.out.println(tree.getTreeName());
            System.out.println(tree.getFruitKind());
            System.out.println(tree.getTreeAge());
            System.out.println(tree.getAmountOfTree());


            Berry strawberry = new Berry();


            strawberry.setName("Strawberry");
            strawberry.setColor("Red");
            strawberry.setTaste("Sweet");
            strawberry.setWeighInBasket(25);

            System.out.println(strawberry.getName());
            System.out.println(strawberry.getColor());
            System.out.println(strawberry.getTaste());
            System.out.println(strawberry.getWeighInBasket());

            Book mia = new Book();
            mia.setName("Mia");
            mia.setPages(456);


            System.out.println(mia.getName());
            System.out.println(mia.getPages());
            System.out.println(daniel.toString());


        }}
