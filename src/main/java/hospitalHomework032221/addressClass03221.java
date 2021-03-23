package hospitalHomework032221;

public class addressClass03221 extends hospitalClass032221 {

    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public addressClass03221(String hospitalName) {
        super(hospitalName);
    }

   // public addressClass03221(String hospitalName, String streetAddress, String town, String state, int zip) {
   //     super(hospitalName);
   //     this.streetAddress = streetAddress;
   //     this.town = town;
   //     this.state = state;
   //     this.zip = zip;
   // }
     @Override
    public String toString()      {
       return " StreetAddress: " + streetAddress + " town: " + town + " state: " + state + " zip: " + zip + "hospital name: " + (getHospitalName().toString());
     }



}//end of class

