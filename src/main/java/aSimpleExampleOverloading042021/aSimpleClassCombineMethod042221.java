package aSimpleExampleOverloading042021;

public class aSimpleClassCombineMethod042221 {

    static int combineMethod(int x, int y) {
        return x + y;
    }
    static double combineMethod(double x, double y) {
        return x + y;
    }

    static double combineMethod(int x, int y, char c){
        //notice we can take in characters and numbers, do operations on the number..cool
        System.out.println("Character from the method is " + c);

        return x + y;
    }

} //end of class
