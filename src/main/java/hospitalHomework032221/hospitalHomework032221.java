package hospitalHomework032221;

import java.util.HashMap;
import java.util.Map;

public class hospitalHomework032221 {
    public static void main(String[] args) {
        System.out.println("Hello there");

       /* Map<Integer, Integer> hashmapNumbers = new HashMap();
        hashmapNumbers.put(1,10);
        hashmapNumbers.put(2,20);
        hashmapNumbers.put(3,30);
        hashmapNumbers.put(4,40); */

        Map<Integer, String > hashmapHospitalRooms = new HashMap();
        hashmapHospitalRooms.put(1,"Intensive Care");
        hashmapHospitalRooms.put(2, "Gastroenterology");
        hashmapHospitalRooms.put(3,"Radiolology");
        hashmapHospitalRooms.put(4,"Emergency Room");

        //creating new doctor with title; getting title from the enumerated class enumDoctorPosition

        enumDoctorsList032521 drBrickerTitle = enumDoctorsList032521.cardiologist;
        enumInsuranceAcceptedByHospital03521 insuranceJohnsHopkins = enumInsuranceAcceptedByHospital03521.Aetna;


        doctorsClass03221 drBricker = new doctorsClass03221("Steven", "Bricker",(drBrickerTitle).toString());
        System.out.println(drBricker);

        hospitalClass032221 johnsHopkins = new hospitalClass032221 ("JohnsHopkins", "123 Main Street","Los Angeles", "CA", 94321 ,(insuranceJohnsHopkins).toString());
        System.out.println(johnsHopkins);







    }
}
