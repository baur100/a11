package hwField;

public class App {
    public static void main(String[] args){
        Music eminem = new Music();

        eminem.setGenre("rap");
        eminem.setArtist("Slim Shady");
        eminem.setYear(2000);
        eminem.setisGood(true);

        eminem.getInfo();

        Game Mario = new Game("Super Mario","Platformer","Gamecube",2000);
        Mario.getInfo();
    }


}
