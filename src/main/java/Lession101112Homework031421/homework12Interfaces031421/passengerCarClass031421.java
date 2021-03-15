package Lession101112Homework031421.homework12Interfaces031421;

public class passengerCarClass031421 implements vehicleInterface031421 {
private String vehicleName;

    public passengerCarClass031421(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void start() {
            System.out.println(vehicleName + " Starting engine...");
        }
        public void stop() {
            System.out.println( vehicleName + " Stopping engine...");
        }

    /* public String getVehicleName() { Don't need get/set to get vehicle name from main..

        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    } */
}//end of class