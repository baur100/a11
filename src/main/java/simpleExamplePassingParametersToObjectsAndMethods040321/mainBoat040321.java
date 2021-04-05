package simpleExamplePassingParametersToObjectsAndMethods040321;

public class mainBoat040321 {
    public static void main(String[] args) {
        System.out.println("Hi There");

        boatClass040321 Catalina27 = new boatClass040321("Catalina", "Sailboat",27);
        Catalina27.boatUnderWay(true);
        System.out.println(Catalina27);

        boatClass040321 Honda24 = new boatClass040321("Honda", "motorboat",34);

        System.out.println(Honda24);
    } //end of main


} //end of class
