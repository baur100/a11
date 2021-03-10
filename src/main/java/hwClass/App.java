package hwClass;

public class App {
    public static void main(String[] args) {
        Game Mario = new Game();
        Mario.genre = "Platformer";
        Mario.name = "Super Mario 64";
        Mario.year = 1993;
        Mario.platform = "N64";

        Mario.rating(5);

        Music Eminem = new Music();
        Eminem.genre = "rap";
        Eminem.artist = "Eminem";
        Eminem.year = 2000;
        Eminem.isGood = true;
        System.out.println(Eminem.info());

    }
}