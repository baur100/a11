package HM8;

public class Bed {
    public String name;
    public String frame;
    public String size;
    public boolean mattress;
    public String yes;
    public String no;

    public String getBed(){
        return "Bed name: " + name + "\nType of the frame: " + frame + "\nSize: " + size;
    }
    public String getMattress(){
        if(mattress){
            return "Bed with mattress\n";
        } return "Bed without mattress\n";
    }
}
