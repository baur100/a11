package homework11;

public class Teacher{
    private String name;
    private Professors rank;



    public Teacher(String name, Professors rank){
        this.name = name;
        this.rank = rank;
    }

    public Teacher(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professors getRank() {
        return rank;
    }

    public void setRank(Professors rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", rank=" + rank + " processor}";
    }
}
