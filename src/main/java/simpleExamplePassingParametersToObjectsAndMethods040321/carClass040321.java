package simpleExamplePassingParametersToObjectsAndMethods040321;

public class carClass040321 {
    private String carManufacturer;
    private String carModel;
    private int carModelYear;
    private boolean carRunning;
    private boolean carTurning;
    private String carTurningStatus; //used to note if the car is turning.
    private String carRunningStatus; //used to note if the car is running.
    //private boolean carPassengerDoorOpening; //used in method. Do I need to declare this here??
    //private String carTrunkResult; //used in method. Do I need to declare this here??

    //first step: create private variables above

    //second step: create constructor based upon the variables above.
    public carClass040321(String carManufacturer, String carModel, int carModelYear, boolean carRunning, boolean carTurning) {
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.carModelYear = carModelYear;
        this.carRunning = carRunning;
        this.carTurning = carTurning;
    }  //end of constructor
    //third step: Create methods in the class that can be run.

      public String theCarTurning(boolean carTurning)  {
        if (carTurning == true) {
            carTurningStatus = "The Car is Turning";
        } else {
            carTurningStatus = "The Car is driving Straight";
        }
          return carTurningStatus;
      } //end of theCarTurning


    public String theCarRunning (boolean carRunning) {
        if (carRunning == true) {
            carRunningStatus = "The Car is Running";
        }
        else {
           carRunningStatus = "The Car is Stopped";
        }
        return carRunningStatus;
    } //end of theCarRunning

    //static methods below. These do not need to be instantiated. They can be run from main directly.
    //thePassengerDoorOpening method, takes in a boolean, and does not return a value.
    //trunkOpening takes in a boolean, and returns a value.


    public static void thePassengerDoorOpening (boolean carPassengerDoorOpening) {
       if (carPassengerDoorOpening == true) {

            System.out.println("The door is open");
        }
        else {
            System.out.println("The door is closed");
        }
        //return void;

    } //end of thePassengerDoorOpening

    public static String theTrunkOpening(boolean trunkOpening) {
          String carTrunkResult;
        if (trunkOpening == true) {
            System.out.println("Trunk is Open");
            carTrunkResult = "Hey Man, the Trunk is Open";
        } else {
            System.out.println("Trunk is Closed");
            carTrunkResult = "Hey Man, the Trunk is Closed";

        }
        return carTrunkResult; //end of theTrunkOpening
    }

    //fourth step: create getters and setters
   /*  public String getCarManufacturer() {   //don't need getters/setters
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarModelYear() {
        return carModelYear;
    }

    public void setCarModelYear(int carModelYear) {
        this.carModelYear = carModelYear;
    }

    public boolean isCarRunning() {
        return carRunning;
    }

    public void setCarRunning(boolean carRunning) {
        this.carRunning = carRunning;
    }

    public boolean isCarTurning() {
        return carTurning;
    }

    public void setCarTurning(boolean carTurning) {
        this.carTurning = carTurning;
    } */
    //fifth step: create toString()
    @Override
    public String toString() {
        return " carManufacturer " + carManufacturer + " carModel " + carModel + " carModelYear " +  carModelYear + " carRunning " + carRunning + " carTurning " + carTurning;
    }
} //end of class
