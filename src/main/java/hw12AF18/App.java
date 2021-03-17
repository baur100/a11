package hw12AF18;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> city=new ArrayList<>();
        city.add("New York");
        city.add("Philadelphia");
        city.add("Cooper city");
        city.add("Savannah");
        city.add("Hollywood");

        city.set(3,"Miami");
        city.remove(2);
        System.out.println(city);


        List<Integer> phones=new ArrayList<>();
        phones.add(954272383);
        phones.add(305672388);
        phones.add(497273834);
        phones.add(732723446);
        phones.add(739811211);

        System.out.println(phones.indexOf(739811211));
        System.out.println(phones.get(2));



        List<Game> games=new ArrayList<>();
        games.add(new Game("Battlefield",5.0,Platforms.PC));
        games.add(new Game("Climb",1.4,Platforms.VR));
        games.add(new Game("Mafia",2.0,Platforms.PLAYSTATION));
        games.add(new Game("World of Warcraft",5.0,Platforms.PC));

        System.out.println(games.size());
        games.set(3,new Game("Climd new horizon",2.1,Platforms.PC));
        System.out.println(games);
    }
}
