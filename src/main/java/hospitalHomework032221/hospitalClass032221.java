package hospitalHomework032221;

public class hospitalClass032221 extends addressClass03221  {

    protected String hospitalName;
    private String insuranceAccepted;


//public class hospitalClass032221 {

    //public hospitalClass032221(String streetAddress, String town, String state, int zip, String hospitalName) {
    public hospitalClass032221(String hospitalName, String streetAddress, String town, String state, int zip, String insuranceAccepted ) {

        super(streetAddress, town, state, zip);
        this.hospitalName = hospitalName;
        this.insuranceAccepted = insuranceAccepted;


    }

    //protected String hospitalName; Remove later


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }


    @Override
    public String toString() {
        return " hospitalName: " + hospitalName + " Address " + getStreetAddress() + " Town: " + getTown() + " State: " + getState() + "zip " + getZip() +" Insurance Accepted: " + insuranceAccepted;
    }
} //end of class

