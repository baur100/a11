package simpleExamplePassingParametersToObjectsAndMethods040321;

public class carClass040321 {
    private String carManufacturer;
    private String carModel;
    private int carModelYear;
    private boolean carRunning;
    private boolean carTurning;
    private String carTurningStatus; //used to note if the car is turning.
    private String carRunningStatus; //used to note if the car is running.

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
        if (carTurning = true) {
            carTurningStatus = "The Car is Turning";
        } else {
            carTurningStatus = "The Car is driving Straight";
        }
          return carTurningStatus;
      } //end of theCarTurning


    public String theCarRunning (boolean carRunning) {
        if (carRunning = true) {
            carRunningStatus = "The Car is Running";
        }
        else {
           carRunningStatus = "The Car is Stopped";
        }
        return carRunningStatus;
    } //end of theCarRunning

    //fourth step: create getters and setters
    public String getCarManufacturer() {
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
    }
    //fifth step: create toString()
    @Override
    public String toString() {
        return " carManufacturer " + carManufacturer + " carModel " + carModel + " carModelYear " +  carModelYear + " carRunning " + carRunning + " carTurning " + carTurning;
    }
} //end of class
