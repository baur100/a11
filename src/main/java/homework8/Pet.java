package homework8;

public class Pet {
    public String name;
    public String breed;
    public String gender;
    public int weight;

    public void appointment(String date){
        System.out.println(name + " has appointment on " + date + ".");
    }

    public void petInfo(){
        System.out.println("The " + gender + " " + breed + " is weighted " + weight + "lbs.");
    }
}
