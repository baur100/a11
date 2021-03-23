package hospitalHomework032221;

//public class hospitalClass032221 extends addressClass03221  {

public class hospitalClass032221 {

protected String hospitalName;

    public hospitalClass032221(String hospitalName, String hospitalName1) {
//        super(hospitalName);
        this.hospitalName = hospitalName1;
    }

    public hospitalClass032221(String hospitalName, String streetAddress, String town, String state, int zip, String hospitalName1) {
//        super(hospitalName, streetAddress, town, state, zip);
        this.hospitalName = hospitalName1;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "hospitalClass032221{" +
                "hospitalName='" + hospitalName + '\'' +
                '}';
    }
} //end of class

