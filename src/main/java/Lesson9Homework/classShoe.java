package Lesson9Homework;

public class classShoe {
    private double shoeSize;
    private String shoeType;
    private String shoeColor;
    private String shoeManufacturer;

    //use code below with
    public classShoe() {
        double shoeSize;
        String shoeType;
        String shoeColor;
        String shoeManufacturer;
    }

public classShoe (Double shoeSize, String shoeType, String shoeColor, String shoeManufacturer ) {
    this.shoeSize=shoeSize;
    this.shoeType=shoeType;
    this.shoeColor=shoeColor;
    this.shoeManufacturer=shoeManufacturer;
    }

public double getShoeSize() {return this.shoeSize;}
public String getShoeType() {return this.shoeType;}
public String getShoeColor() {return this.shoeColor;}
public String getShoeManufacturer() {return this.shoeManufacturer;}

public void setShoeSize(double shoeSize){this.shoeSize=shoeSize;}
public void setShoeType(String shoeType){this.shoeType=shoeType;}
public void setShoeColor(String shoeColor){this.shoeColor=shoeColor;}
public void setShoeManufacturer(String shoeManufacturer){this.shoeManufacturer=shoeManufacturer;}



String returnShoeparameters (double shoeSize, String shoeType, String shoeColor, String shoeManufacturer )
{ String shoeParameters;
shoeParameters= "Shoesize " + shoeSize + " shoeType "+ shoeType + "shoeColor " + shoeColor + "shoeManufacturer " + shoeManufacturer;
return shoeParameters;}


} //end of class

