package inheritanceExamsTest02221;

public class certificatesClass extends studentResultsClass {

    private String certificate;

    certificatesClass() {
        super();
        certificate = "No Certificate Awarded";
    }


        String certificateAwarded (int aScore) {

        String aGrade =examGrade(aScore);

            if (aGrade.equals("Grade is A") ) {
                this.certificate = "Certificate of Excellence";
            }
            else if (aGrade.equals("Grade is B")) {
                this.certificate = "Certificate of Achievement: B";

            }
            else if (aGrade.equals("Grade is C")) {
             this.certificate = "Certificate of Achievement: C";

            }
            else {
                this.certificate = "No Certificate Awarded";
            }
            return this.certificate;
        }


} //end of class
