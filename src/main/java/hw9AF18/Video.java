package hw9AF18;

public class Video {
    private String name;
    private String type;
    private int weight;
    private int length;

    public Video(){};
    public Video(String name, String type, int weight, int length) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    public String infoVideo() {
        return "---VIDEO----"+
                "\nVideo name=" + name +
                "\nType=" + type +
                "\nWeight=" + weight +
                "\nLength=" + length;
    }
}
