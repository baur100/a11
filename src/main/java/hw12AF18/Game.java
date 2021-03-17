package hw12AF18;

public class Game {
    public String name;
    public double version;
    public Platforms platforms;

    public Game(String name, double version, Platforms platforms) {
        this.name = name;
        this.version = version;
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "  [Game " + name +
                ". Version= " + version +
                ". Platforms= " + platforms+"]  ";
    }
}
