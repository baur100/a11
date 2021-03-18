package Lesson101112HomeworkCorrected031621.homework12InterfacesCorrected031621;

import Lession101112Homework031421.homework12Interfaces031421.vehicleInterface031421;

public class truckClass031621 implements vehicleInterface031421 {
    private String vehicleName;

    public truckClass031621(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void start() {
        System.out.println(vehicleName + " Starting engine...");
    }
    public void stop() {
        System.out.println(vehicleName + " Stopping engine...");
    }
} //end of class


