package Lesson8Homework;

public class classStove {

        public String stoveType;
        public String stoveManufacturer;
        public int numberOfBurners;
        public boolean onOrOff;
        public String stoveStatus;

        public String getStoveInfo(){
            return "Stove Type: " + stoveType + " " + "Stove Manufacturer " + stoveManufacturer + "  " + "number of burners " + numberOfBurners ;
        }

        /*public boolean getStoveState() {
            if (onOrOff) {
                return true;
            }
            return false;
        }*/

        public String getStoveState() {
            if (onOrOff == true) {
                return "Stove is On"; }
            else
            { return "Stove is Off"; }

        }

}


