package lesson8;

public class Dog {
    private String breed;
    private int age;
    private int weight;


    // full constructor
    public Dog(String breed, int age, int weight ){
        this.breed=breed;
        this.age=age;
        this.weight=weight;

    }

    // default constructor
    public Dog( ){ }

    // setters and getters
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // methods

    public void eat(String food){
        System.out.println("This dog eats " + food );
    }

    public void sleep(int hours){
        System.out.println("This dog sleeps " + hours + " hours");
    }


    public void printDogInfo(){

        System.out.println("The breed of the dog is " + breed);
        System.out.println("The dog is " + age + " years old");
        System.out.println("The weight of the dog is " + weight);
    }

}


