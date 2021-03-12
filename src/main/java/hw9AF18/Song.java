package hw9AF18;

public class Song {
    private String name;
    private String type;
    private int weight;
    private double length;

    public Song(){};
    public Song(String name, String type, int weight, double length) {
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

    public double getLength() {
        return this.length;
    }

    public void setLength(double newLength) {
        this.length = newLength;
    }

    public void infoSong() {
        System.out.println( "---SONG----"+
                "\nSong name=" + name +
                "\nType=" + type +
                "\nWeight=" + weight +
                "\nLength=" + length);
    }

    public String duration(){
        if(this.length>=3&&this.length<=5){
            return "This "+this.name+" song has middle duration";
        }if(this.length<3){
            return "This "+this.name+" song has short duration";
        } return "This "+this.name+" song has long duration";
    }
}
