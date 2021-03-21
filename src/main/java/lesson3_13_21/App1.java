package lesson3_13_21;

public class App1 {
    public static void main(String[] args) {

        Person john = new Person(new Name("John", "Amos"), 1989);

        Name ann = new Name("Ann", "Wilson");
        Person anna = new Person(ann, 1995);

        Person[] teamMembers = {anna, john};

        Team victory = new Team(teamMembers, "Victory");

        String annaLastName = victory.getPeople()[1].getName().getLastName();
        System.out.println(annaLastName);
    }
}
