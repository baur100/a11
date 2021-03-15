package lesson11_UA;

public class Team {
    private Person[]people;
    private String teamName;

    public Team(Person[] people, String teamName) {
        this.people = people;
        this.teamName = teamName;
    }

    public Person[] getPeople() {
        return people;
    }

    public String getTeamName() {
        return teamName;
    }
}
