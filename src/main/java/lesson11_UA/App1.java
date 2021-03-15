package lesson11_UA;

public class App1 {
    public static void main(String[] args) {
        Person john = new Person(new Name("John", "Amos"), 1989);

        Name ann = new Name("Ann", "Walker");
        Person anna = new Person(ann, 1990);

        Person[]teamMembers = {anna, john};

        Team victory = new Team(teamMembers, "Victory");

        String annaLastName = victory.getPeople()[0].getName().getLastName();
        System.out.println(annaLastName);

    }
}
