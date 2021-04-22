package aSimpleJavaPolymorphismExample042021;

public class javaSimplePolymorphismMain42021 {

    public static void main(String[] args) {
        System.out.println("Hi There");

        classAnimalBaseClass042021 myAnimal = new classAnimalBaseClass042021();  // Create a Animal object
        classAnimalBaseClass042021 myPig = new classPigExtendsAnimal042021();  // Create a Pig object
        classAnimalBaseClass042021 myDog = new classDogExtendAnimal0420221();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

    } //end of main
} //end of class
