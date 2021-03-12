package Lesson9Homework;

public class classBoat {

    private String boatMake;
    private String boatModel;
    private int knots;

    public classBoat(String boatMake, String boatModel, int knots) {
        this.boatMake = boatMake;
        this.boatModel = boatModel;
        this.knots = knots;
    }

    //using this for default constructor
    public classBoat() {
        String boatMake;
        String boatModel;
        int knots;
    }

    public String getboatMake() {return this.boatMake; }
    public String getBoatModel() {return this.boatModel; }
    public int getknots() {return this.knots; }
    public void setboatMake(String boatMake) {this.boatMake=boatMake; }
    public void setboatModel(String boatModel) {this.boatModel=boatModel;}
    public int setKnots(int knots) {return this.knots=knots; }

    //Printing Boatparameters below
    String returnBoatParameters (String boatMake, String boatModel, int knots) {
      String boatParameters;
      boatParameters = "boatMake " + boatMake + " boatModel " + boatModel + " boat Speed: " + knots + " knots ";
      return boatParameters; }

    public void sail (int knots){
        System.out.println(boatMake+" " + boatModel+ " sailing with speed = " + knots + " knots per hour");
    }

} //end of class




