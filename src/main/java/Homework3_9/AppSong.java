package Homework3_9;

public class AppSong {
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.name = "Blackout";
        song1.artist = "Scorpions";
        song1.genre = "Rock";
        song1.releaseDate = 1984;
        song1.statusPlay = false;
        song1.play = "Play";
        song1.pause = "Pause";



        Song song2 = new Song();
        song2.name = "Child in Time";
        song2.artist = "Deep Purple";
        song2.genre = "Rock";
        song2.releaseDate = 1974;
        song2.statusPlay = true;
        song2.play = "Play";
        song2.pause = "Pause";



        String songPlay1 = song1.getSongInfo();

        System.out.println(songPlay1);

        System.out.println(song1.getStatus());

        String songPlay2 = song2.getSongInfo();

        System.out.println(songPlay2);

        System.out.println(song2.getStatus());

           }
}
