package lesson14Homework031821;

public class flightClass031821 {
    private Integer flightNumber;
    private String typeAircraft;

 public flightClass031821(Integer flightNumber, String typeAircraft) {
        this.flightNumber = flightNumber;
        this.typeAircraft = typeAircraft;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeAircraft() {
        return typeAircraft;
    }

    public void setTypeAircraft(String typeAircraft) {
        this.typeAircraft = typeAircraft;
    }

    @Override
    public String toString() {
        return  "\n" + "flightClass031821 " + " flightNumber: " + flightNumber + " typeAircraft: " + typeAircraft ;
    }
} //end of class

