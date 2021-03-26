package hw14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> animals = new HashMap<>();
        animals.put("Dog","Mammal");
        animals.put("Catfish","Fish");
        animals.put("Snake","Reptile");
        animals.put("Spider","Insect");
        animals.put("Cat","Mammal");

        Map<Integer,String> ids = new HashMap<>();
        ids.put(001,"Charlie");
        ids.put(002,"Rachel");
        ids.put(003,"Ezekiel");
        ids.put(004,"Marley");



        Map<Car,Game> cargame = new HashMap<>();
        cargame.put(new Car("Tesla","Crx"),new Game("Mario","Gamecube"));
        cargame.put(new Car("Audi","A4  "),new Game("Halo","Xbox"));
        cargame.put(new Car("BMW","Bmx"),new Game("yoshi","Gameboy"));
        cargame.put(new Car("Mercedse","59x"),new Game("poro","PC"));


        ids.replace(004,"Jose");
        animals.remove("Cat");
        String cat = animals.get("Dog");

        Collection<String> living = animals.values();
        for (String a : living){
            System.out.println(a);
        }

        for (String a : animals.values()){
            System.out.println(a);
        }

        System.out.println(animals);
        System.out.println(ids);
        System.out.println(cat);
        System.out.println(cargame);
        System.out.println("*************************************");
        System.out.println("***************   Hospital project    **********************");

        //HOSPITAL
        //make doctors
        Map<Integer,String> rooms = new HashMap<>();
        rooms.put(100,"Cafeteria");
        rooms.put(200,"X-ray");
        rooms.put(300,"Patient");
        rooms.put(400,"Office");

        Address sacredHearts = new Address("254 Fullerton Road", "Fullerton", "California",92839);
        Doctor martinez = new Doctor("ramiez","rodriguez",Position.DIAGNOSTICIAN);
        Doctor lee = new Doctor("martin","lee",Position.INTERNAL);
        Doctor hyung = new Doctor("jacob","hyung",Position.ONCOLOGIST);

        ArrayList<InsuranceCompanies> insure = new ArrayList<>();
        insure.add(InsuranceCompanies.ALLSTATE);
        insure.add(InsuranceCompanies.NATIONWIDE);
        insure.add(InsuranceCompanies.HEALTHNET);

        ArrayList<Doctor> docs = new ArrayList<>();
        docs.add(martinez);
        docs.add(lee);
        docs.add(hyung);



        Hospital sacred = new Hospital("Sacred Hearts",sacredHearts,docs,rooms,insure);
        System.out.println(sacred);
        System.out.println("************     Below is a list of all the rooms      **************");
        System.out.println(sacred.getRooms());
        System.out.println("************************     Doctors Name and Position     ***********************************");

        for (Doctor Doctor : sacred.getDoctors()){
            System.out.println("Doctors first name is "+ Doctor.getName() + " their position is " + Doctor.getPosition());

        }

    }
}
