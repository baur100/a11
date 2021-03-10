package hw8AF18;

public class Sofa {
    public String model;
    public String shape;
    public int sections;
    public int price;


    public String getType(){
        if(sections>3){
            return "The "+model+" is a sectional sofa";
        }return "Easy to assemble sofa";
    }

    public void infoSofa(){
        System.out.println("The SOFA"+"\nModel-"+model+" shape-"+shape
                +"\nSections-"+sections+"\nPrice-"+price);
    }
}
