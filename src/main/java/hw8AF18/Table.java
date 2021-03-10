package hw8AF18;

public class Table {
    public String model;
    public String type;
    public int price;
    public String feature;


    public String bestMatch(String room){
        return "This table "+model+" will look great in your "+room+"because the table has feature-"+feature+".";
    }
    public void infoTable(){
        System.out.println("The TABLE\nModel-"+model+"\nType-"+type+"\nPrise-"+price);
    }
}
