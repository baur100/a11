package hw15AF18;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor(){};
    public Doctor(String name,String lastName,Position position){
        this.name=name;
        this.lastName=lastName;
        this.position=position;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setPosition(Position position){
        this.position=position;
    }
    public Position getPosition(){
        return this.position;
    }

    @Override
    public String toString(){
        return "\nDoctor: "+name+" "+lastName+
                ". Position: "+position;
    }
}
