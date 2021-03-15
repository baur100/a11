package lesson9;

public class SportsTeam {
    private String name;
    private int players;
    private String captain;

    // full constructor
    public SportsTeam(String name, int players, String captain ){
        this.name=name;
        this.players=players;
        this.captain=captain;
    }

    // default constructor
    public SportsTeam(){}

    // setters and getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPlayers(int players){
        this.players=players;
    }
    public int getPlayers(){
        return players;
    }
    public void setCaptain(String captain){
        this.name = name;
    }
    public String getCaptain(){
        return this.captain;
    }

    // methods
    public void Wins(int num){
        System.out.println("The team has " + num + " wins");
    }

    public void printTeamInfo(){

        System.out.println("The name of the team is " + name);
        System.out.println("The team has " + players + " players");
        System.out.println("The captain of the team is " + captain);
    }

}
