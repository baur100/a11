package Lession101112Homework031421.homework12Interfaces031421;

    public class truckClass031421 implements vehicleInterface031421 {
        private String vehicleName;

        public truckClass031421(String vehicleName) {
            this.vehicleName = vehicleName;
        }

        public void start() {
            System.out.println(vehicleName + " Starting engine...");
        }
        public void stop() {
            System.out.println(vehicleName + " Stopping engine...");
        }
    } //end of class


