package Lesson101112HomeworkCorrected031621.homework11EnumsAndClassesCorrected031621;

import Lession101112Homework031421.homework11EnumsAndClasses031421.enumDessert031421;

public class dessertClass031621 {
    private enumDessert031421 dessertdish;
    private enumDessertSize031621 dessertSize;
    private int numberofDesserts;

    public dessertClass031621(enumDessert031421 dessertdish, enumDessertSize031621 dessertSize, int numberofDesserts) {

        this.dessertdish = dessertdish;
        this.numberofDesserts = numberofDesserts;
        this.dessertSize = dessertSize;
        this.numberofDesserts = numberofDesserts;
    }


    @Override
    public String toString() {
        //return "dessertClass031421  Dessertdishfromenum: " + dessertdish + ", DessertSize: " + dessertSize + " NumberofDesserts: " + numberofDesserts;
        return "dessertClass031421  Dessertdishfromenum: " + dessertdish + ", DessertSize: " + dessertSize + " NumberofDesserts: " + numberofDesserts;
    }
} //end of class
