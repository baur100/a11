package hospitalHomework032221;

public class hospitalClass032221 extends addressClass03221  {

//public class hospitalClass032221 {

    //public hospitalClass032221(String streetAddress, String town, String state, int zip, String hospitalName) {
    public hospitalClass032221(String hospitalName, String streetAddress, String town, String state, int zip) {

        super(streetAddress, town, state, zip);
        this.hospitalName = hospitalName;
    }


    //old constructor below
    //public hospitalClass032221(String streetAddress, String town, String hospitalName) {
    //    super(streetAddress, town);
    //    this.hospitalName = hospitalName;
   /// }

    protected String hospitalName;

 //   public hospitalClass032221(String hospitalName) {
//        super(hospitalName);
//        this.hospitalName = hospitalName;
//    }


  //  public String getHospitalName() {
  //      return hospitalName;
  //  }

  //  public void setHospitalName(String hospitalName) {
  //      this.hospitalName = hospitalName;
  //  }


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return " hospitalName: " + hospitalName + " Address " + getStreetAddress() + " Town: " + getTown() + " State: " + getState() + "zip " + getZip() ;
    }
} //end of class

