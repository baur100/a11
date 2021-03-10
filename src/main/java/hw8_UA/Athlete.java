package hw8_UA;

public class Athlete {
    public String firstName;
    public String lastName;
    public String sport;
    public String team;
    public int jerseyNumber;
    public String position;

    public void getPlayerInfo(){
        System.out.println(firstName + " " + lastName + " is a " + sport + " player, currently playing for the " + team + "." + " He currently is playing as a " + position + " and wears the number " + jerseyNumber + ".");
    }
}
