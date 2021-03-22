package hw15AF18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
        public static void main(String[] args) {
            List<Doctor> doctors=new ArrayList<>();
            doctors.add(new Doctor("Maria","Shulz",Position.PEDIATRICIAN));
            doctors.add(new Doctor("Jack","Freeman",Position.ANESTHESIOLOGIST));
            doctors.add(new Doctor("Amily","Seeran",Position.SURGEON));
            doctors.add(new Doctor("Kale","Milikov",Position.GYNECOLOGIST));

            Map<Integer,String> cabinets= new HashMap<>();
            cabinets.put(111," Operating room");
            cabinets.put(222," Intensive care");
            cabinets.put(333," Emergency room");
            cabinets.put(444," Consulting room");


            List<InsuranseCompamies> insurance= new ArrayList<>();
            insurance.add(InsuranseCompamies.AMBETTER);
            insurance.add(InsuranseCompamies.OSCAR_QUALITY);
            insurance.add(InsuranseCompamies.BRIGHT_PLUS);
            insurance.add(InsuranseCompamies.UNITED_HEALTHCARE);

            Hospital h1=new Hospital("Memorial Hospital",
                    new Address("111 Stirling Rd","Dania Beach","Florida",33111),
                    doctors,cabinets,insurance);

            //h1.infoHospital();
            //h1.printDoctors();
            h1.printRooms();
        }
    }


