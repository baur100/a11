package simpleExamplePassingParametersToObjectsAndMethods040321;

public class mainCar040321 {
    public static void main(String[] args) {
        System.out.println("hi There");

        //once objects and methods have been created, need to create create instances of the objects:

        carClass040321 Corolla = new carClass040321("Toyota", "Corolla", 2013, true, true);
        System.out.println(Corolla);

        carClass040321 Escalade = new carClass040321("Cadillac", "Escalade", 2019, false, false);
        System.out.println(Escalade);

    }
}
