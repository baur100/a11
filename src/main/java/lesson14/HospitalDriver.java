package lesson14;
import java.util.*;

public class HospitalDriver {
    public static void main(String[] args) {

        Map<Integer, String> patient_rooms = new HashMap<>();
        patient_rooms.put(100, "OBGYN");
        patient_rooms.put(200, "Gasteroenterology");
        patient_rooms.put(202, "Pediatrics");
        patient_rooms.put(300, "Cardiology");

        Address addressHospital = new Address("1450 Salem St", "Roanoke", "Virginia", 24060);

        ArrayList<Doctor> docs = new ArrayList<Doctor>();
        docs.add(new Doctor("John","Smith", Position.PEDIATRICIAN));
        docs.add(new Doctor("Jason","Solomon", Position.OBGYN));
        docs.add(new Doctor("Tina","Smith", Position.OBGYN));
        docs.add(new Doctor("Sam","Taylor", Position.ONCOLOGIST));

        ArrayList<InsuranceCompanies> insurances = new ArrayList<InsuranceCompanies>();
        insurances.add(InsuranceCompanies.AETNA);
        insurances.add(InsuranceCompanies.BCBS);
        insurances.add(InsuranceCompanies.HUMANA);
        insurances.add(InsuranceCompanies.UHC);
        insurances.add(InsuranceCompanies.CIGNA);


       Hospital baptist = new Hospital("Baptist", addressHospital, docs, patient_rooms,insurances);

        System.out.println(" ");
        System.out.println(baptist);
        System.out.println("********************************");
        printDoctors(baptist.getDoctors());
        System.out.println("********************************");



        for (Map.Entry<Integer,String> p: patient_rooms.entrySet()){
            System.out.println("Room " + p.getKey()+" is "+ p.getValue());
            }



    }


         public static void printDoctors( List<Doctor> dList) {
            System.out.println("The hospital has the following doctors on staff: ");
            for (Doctor d : dList) {
                System.out.println(
                "Doctor's name is " +
                        d.getName() +
                        " " + d.getLastName() +
                        " and title is " + d.getPosition() );
             }
          }



    }

