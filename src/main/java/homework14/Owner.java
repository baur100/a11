package homework14;

public class Owner {
    private String name;

    public Owner(String name){
        this.name = name;
    }

    public Owner(){

    }

    public String getName(String name){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner name= " + name;
    }
}
