package Lesson9Homework;

public class classHat {

    private String hatStyle;
    private String hatColor;
    private int hatSize;


    public classHat(String hatStyle, String hatColor, int hatSize) {
        this.hatStyle=hatStyle;
        this.hatColor=hatColor;
        this.hatSize=hatSize;
    }

    public String gethatColor() {return this.hatColor; }
    public Integer gethatSize() {return this.hatSize;  }
    public String gethatStyle() {return this.hatStyle; }
    public void sethatColor(String hatColor){this.hatColor=hatColor;}
    public void sethatStyle(String hatStyle){this.hatStyle=hatStyle;}
    public void sethatSize (int hatSize) {this.hatSize=hatSize; }

    //using this  for top hat, default cconstructor.
    public classHat() {
         String hatStyle;
         String hatColor;
         Integer hatSize;
     }

  String returnHatparameters (String hatStyle, String hatColor, Integer hatSize ) {
        String hatparameters;
        hatparameters ="hatStyle: " + hatStyle + " hatColor: " + hatColor + " hatSize " + hatSize;
    return hatparameters;}

  }//end of class
