package Lession101112Homework031421.homework11EnumsAndClasses031421;

public class dessertClass031421 {
    private enumDessert031421 dessertdishfromenum;
    private String dessertSize;
    //private String dessertdish;
    private int numberofDesserts;

    public dessertClass031421(enumDessert031421 dessertdishfromenum, String dessertSize, int numberofDesserts) {
        this.dessertdishfromenum = dessertdishfromenum;
        this.dessertSize = dessertSize;
        this.numberofDesserts = numberofDesserts;
    }

    public enumDessert031421 getDessertdishfromenum() {
        return dessertdishfromenum;
    }

    public void setDessertdishfromenum(enumDessert031421 dessertdishfromenum) {
        this.dessertdishfromenum = dessertdishfromenum;
    }

    public String getDessertSize() {
        return dessertSize;
    }

    public void setDessertSize(String dessertSize) {
        this.dessertSize = dessertSize;
    }

    public int getNumberofDesserts() {
        return numberofDesserts;
    }

    public void setNumberofDesserts(int numberofDesserts) {
        this.numberofDesserts = numberofDesserts;
    }

    @Override
    public String toString() {
        return "dessertClass031421  Dessertdishfromenum: " + dessertdishfromenum + ", DessertSize: " + dessertSize + " NumberofDesserts: " + numberofDesserts;

    }
} //end of class
