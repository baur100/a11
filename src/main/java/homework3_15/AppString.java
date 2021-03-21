package homework3_15;

import java.util.ArrayList;
import java.util.List;

public class AppString {
    public static void main(String[] args) {
        List<String> vehicles=new ArrayList<>();
        vehicles.add("TOYOTA");
        vehicles.add("HONDA");
        vehicles.add("BMW");
        System.out.println(vehicles);
        vehicles.add("FORD");
        vehicles.add("KIA");
        System.out.println(vehicles);
        vehicles.add(1,"MERCEDES");
        System.out.println(vehicles);
        vehicles.add(0,"LEXUS");
        vehicles.add(4,"HYUNDAI");
        System.out.println(vehicles);
        System.out.println(vehicles.get(1));
        System.out.println(vehicles.size());
        vehicles.add(8,"AUDI");
        System.out.println(vehicles);
        vehicles.set(7,"MAZDA");
        vehicles.set(2,"PORSCHE");
        System.out.println(vehicles);
        vehicles.remove(2);
        System.out.println(vehicles);
        vehicles.remove("MAZDA");
        System.out.println(vehicles);

        System.out.println(vehicles.get(4));
        List<String>vehiclesModel=new ArrayList<>();
        vehiclesModel.add("CAMRY");
        vehiclesModel.add("COROLLA");
        vehiclesModel.add("RAV4");
        vehicles.addAll(2,vehiclesModel);
        System.out.println(vehicles);
        boolean isInList=vehicles.contains("FORD");
        System.out.println(isInList);
        String removedElement=vehicles.set(4,"TACOMA");
        System.out.println(vehicles);
        System.out.println(removedElement);

        for (String v:vehicles) {
            System.out.println(v);
        }
        for (int i=0;i<vehicles.size();i++){
            System.out.println(vehicles.get(i));
        }



    }
}
