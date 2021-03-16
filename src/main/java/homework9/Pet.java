package homework9;

public class Pet {
    private String name;
    private String breed;
    private double weight;

    public Pet(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public Pet(){}

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void printInfo(){
        System.out.println(name + " is a(n) " + breed + " weight for " + weight);
    }
}
