package HW13Hospital;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Doctor dentistJacob = new Doctor("Jacobe", "Last Name", Title.MEDICALDENTISTRY);
        Doctor podiatricIsabella = new Doctor("Isabella", "Last Name", Title.PODIATRIC);

        List<Doctor> listDoctors = new ArrayList<>();
        listDoctors.add(dentistJacob);
        listDoctors.add(podiatricIsabella);
        System.out.println(listDoctors);
        System.out.println(dentistJacob.printDoctors());

        Address hosp1Address = new Address("Indiana St","San Francisco", "CA",94100);
        Address hosp2Address = new Address("1st street", "San Francisco", "CA", 94102);


    }

}
