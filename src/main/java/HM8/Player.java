package HM8;

public class Player {
    public Integer life;
    public  String name;
    public  boolean health;
    public  String alive;
    public String dead;

    public String playerIsAlive(){
        if (health){
            return "The player is :" + alive;
        } return "The player is :" + dead;
    }

    public Integer addHealth() {
        if(life == 0) {
            return 100;
        } return life;
    }

    public String descriptionOfPlayer() {
        return "Name: " + name + "\n" + playerIsAlive() +  "\n" + "Heals: " + addHealth() + "\n";
    }

}
