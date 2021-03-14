package hm9;

public class Table {
    private String name;
    private String size;
    private String type;

    public Table(){}

    public Table(String name, String size, String type){
        this.name = name;
        this.size = size;
        this.type = type;
    }
    public Table(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String printInfo(){
        return "The table is:" + name + "\ntype: " + type;
    }
    public String printClass(){
        return "The size of the table is: " + size +"\n";
    }
}
