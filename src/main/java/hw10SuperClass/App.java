package hw10SuperClass;

public class App {
    public static void main(String[] args) {
        Apple fruitApple = new Apple("Red apple", "Round shape", "Sweet", true);
        Apple greenApple = new Apple("Green apple", "Round shape", "Sour", true);

        System.out.println(fruitApple.toString() + "\n" + greenApple.toString() +"\n");

        Banana yellowBanana = new Banana("Banana", "Banana shape", "Sweet", false);
        Banana plantainsBanana = new Banana("Plantains", "Banana shape", "sweet", false);

        System.out.println(yellowBanana.toString() + "\n" + plantainsBanana.toString() +"\n");

        Pear greenPear = new Pear("Green Pear", "Round", "Sweet and sour", true);
        Pear yellowPear = new Pear("Yellow pear", "Round", "sweet", true);
        System.out.println(greenPear.toString() + "\n" + yellowPear.toString());
    }
}
