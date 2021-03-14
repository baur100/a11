package hm9;

public class Bed {
    private String name;
    private String type;
    private String size;

    public Bed(String name, String type, String size) {
        this.name = name;
        this.size = size;
        this.type =type;

    }

    public Bed() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String printInfo(){
        return "Name:" + name + "\nType of the bad: " + type;
    }
    public String printClass(){
        return "Size of the bed: " + size +"\n";
    }
}
