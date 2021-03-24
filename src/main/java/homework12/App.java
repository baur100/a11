package homework12;

public class App {
    public static void main(String[] args) {
        // 2 objects from each class
        Domesticated dog = new Domesticated();
        Domesticated cat = new Domesticated();
        Wild wolf = new Wild();
        Wild tiger = new Wild();

        // Assign one object to interface
        Animal goat = new Domesticated();
        Animal vulture = new Wild();

        dog.interaction();
        cat.interaction();
        wolf.interaction();
        tiger.interaction();
        goat.interaction();
        vulture.interaction();
    }
}
