package homework3_17_21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppHospital {
    public static void main(String[] args) {
        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(10, "Physician");
        rooms.put(15, "Dentist");
        rooms.put(18, "Optometrist");
        rooms.put(23, "Neurologist");
        rooms.put(28, "Surgeon");

        List<InsuranseCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(new InsuranseCompanies(InsuranseCompany.UNITEDHealthCare));
        acceptedInsuranses.add(new InsuranseCompanies(InsuranseCompany.BlueCrossBlueShield));
        acceptedInsuranses.add(new InsuranseCompanies(InsuranseCompany.HUMANA));
        acceptedInsuranses.add(new InsuranseCompanies(InsuranseCompany.BMCHealthNET));

        Hospital hospital = new Hospital();
        Address addressHospital = new Address();

        hospital.printHospitalInfo("Newton-Wellesley", new Address("230 Washington Street", "Newton", "MA", 24590));

        for (InsuranseCompanies v : acceptedInsuranses) {
            System.out.println(v);
        }

        Doctor matthew = new Doctor();
        Doctor michel = new Doctor();
        Doctor jennifer = new Doctor();
        Doctor sophia = new Doctor();
        Doctor emma = new Doctor();

        matthew.printDoctors("Matthew", "Johnson", Position.PHYSICIAN);
        michel.printDoctors("Michel", "Smith", Position.SURGEON);
        jennifer.printDoctors("Jennifer", "Brown", Position.NEUROLOGIST);
        sophia.printDoctors("Sophia", "Miller", Position.OPTOMETRIST);
        emma.printDoctors("Emma", "Davis", Position.DENTIST);

        for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
            System.out.println("Room#"+entry.getKey() + "-" + entry.getValue());
        }
    }
}


