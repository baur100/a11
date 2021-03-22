package homework3_17_21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppHospital {
    public static void main(String[] args) {
        Address addressHospital = new Address("230 Washington Street", "Newton", "MA", 24590);

        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(10, "Physician");
        rooms.put(15, "Dentist");
        rooms.put(18, "Optometrist");
        rooms.put(23, "Neurologist");
        rooms.put(28, "Surgeon");

        List<InsuranceCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(new InsuranceCompanies(InsuranceCompany.UNITEDHealthCare));
        acceptedInsuranses.add(new InsuranceCompanies(InsuranceCompany.BlueCrossBlueShield));
        acceptedInsuranses.add(new InsuranceCompanies(InsuranceCompany.HUMANA));
        acceptedInsuranses.add(new InsuranceCompanies(InsuranceCompany.BMCHealthNET));

        List<Doctor> doctorList=new ArrayList<>();

        Doctor matthew = new Doctor("Matthew", "Johnson", Position.PHYSICIAN);
        Doctor michel = new Doctor("Michel", "Smith", Position.SURGEON);
        Doctor jennifer = new Doctor("Jennifer", "Brown", Position.NEUROLOGIST);
        Doctor sophia = new Doctor("Sophia", "Miller", Position.OPTOMETRIST);
        Doctor emma = new Doctor("Emma", "Davis", Position.DENTIST);

        doctorList.add(matthew);
        doctorList.add(michel);
        doctorList.add(jennifer);
        doctorList.add(sophia);
        doctorList.add(emma);

        Hospital hospital = new Hospital("Newton-Wellesley",addressHospital,doctorList,acceptedInsuranses,rooms);

        hospital.printInfo();
    }
}


