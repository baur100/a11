package simpleExamplePassingParametersToObjectsAndMethods040321;

public class mainCar040321 {

    public static void main(String[] args) {
        System.out.println("hi There");
        String trunkDoorOpen;

        //once objects and methods have been created, need to create create instances of the objects:

        carClass040321 Corolla = new carClass040321("Toyota", "Corolla", 2013, true, true);
        System.out.println(Corolla);
        //carClass040321.theDoorOpening("Door Opening");

        carClass040321 Escalade = new carClass040321("Cadillac", "Escalade", 2019, false, false);
        System.out.println(Escalade);

        //calling a static method below. The method is  associated with the car Class, but is not associated with an
        //instance of the car class..we call it directly. This method does not return anything.
        carClass040321.thePassengerDoorOpening(true);

        carClass040321.thePassengerDoorOpening(false);

        //calling a static method below. The method is  associated with the car Class, but is not associated with an
        //instance of the car class..we call it directly. This method does not return anything.
        carClass040321.thePassengerDoorOpening(true);

        carClass040321.thePassengerDoorOpening(false);


        System.out.println(trunkDoorOpen = carClass040321.theTrunkOpening(false));
        System.out.println(trunkDoorOpen = carClass040321.theTrunkOpening(true));






    }
    //calling a static method below:


}
