package hospitalHomework032221;

public class doctorsClass03221  {
    private String doctorFirstName;
    private String doctorLastName;
    private String doctorPosition;

   public doctorsClass03221(String doctorFirstName, String doctorLastName, String doctorPosition) {
       this.doctorFirstName = doctorFirstName;
       this.doctorLastName = doctorLastName;
       this.doctorPosition = doctorPosition;
   } //end of constructor



    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public void setDoctorFirstName(String doctorFirstName) {
        this.doctorFirstName = doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public void setDoctorLastName(String doctorLastName) {
        this.doctorLastName = doctorLastName;
    }


    @Override

    public String toString() {
        return "doctorsClass03221 "+ " doctorFirstName: " + doctorFirstName + " doctorLastName: " + doctorLastName + " doctorPosition " + doctorPosition ;


    }
} //end of class
