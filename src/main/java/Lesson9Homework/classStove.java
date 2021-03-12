package Lesson9Homework;

public class classStove {

    private String stoveType;
    private String stoveManufacturer;
    private int numberOfBurners;
    private boolean onOrOff;

    //needed for default constructor (kitchen stove)
    public classStove() {
        String stoveType;
        String stoveManufacturer;
        Integer numberOfBurners;
        Boolean onOrOff;
    }

    public classStove(String stoveType, String stoveManufacturer, int numberOfBurners, boolean onOrOff) {
        this.stoveType = stoveType;
        this.stoveManufacturer = stoveManufacturer;
        this.numberOfBurners = numberOfBurners;
        this.onOrOff = onOrOff;
    }

    public String getStoveType() {return this.stoveType;}
    public String getStoveManufacturer() {return this.stoveManufacturer;}
    public Integer getNumberOfBurners() {return this.numberOfBurners;}
    public Boolean getonOrOff() {return this.onOrOff;}

    public void setStoveType(String stoveType){this.stoveType=stoveType;}
    public void setStoveManufacturer(String stoveManufacturer) {this.stoveManufacturer=stoveManufacturer;}
    public void setNumberOfBurners (int numberOfBurners){ this.numberOfBurners=numberOfBurners;};
    public void setOnOrOff(boolean onOrOff) {this.onOrOff=onOrOff;};

    String ReturnStoveparameters (String stoveType, String stoveManufacturer, int numberOfBurners, boolean onOrOff) {
        String stoveparameters;
        stoveparameters = "stoveType: " + stoveType + "stove manufacturer: " + stoveManufacturer + " numberOfBurners: " + numberOfBurners + " On or Off:" + onOrOff;
        return (stoveparameters);
    }


    } //end of class

