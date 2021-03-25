package hospitalHomework032221;

public class addressClass03221  {

    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public addressClass03221(String streetAddress, String town, String state,int zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTown() {
        return town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

//    @Override
 //   public String toString()      {
 //      return " StreetAddress: " + streetAddress + " town: " + town + " state: " + state + " zip: " + zip + "hospital name: " + (getHospitalName().toString());
 //    }



}//end of class

