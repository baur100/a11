package hw14;

public class Game {
     private String name;
     private String platform;

    public Game(String name, String platform) {
        this.name = name;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}
