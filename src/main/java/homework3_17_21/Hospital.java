package homework3_17_21;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctorList;
    private List<InsuranceCompanies> acceptedInsurances;
    private Map<Integer,String> rooms;

    public Hospital(String hospitalName, Address address, List<Doctor> doctorList,List<InsuranceCompanies> acceptedInsurances,Map<Integer, String> rooms) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctorList = doctorList;
        this.acceptedInsurances=acceptedInsurances;
        this.rooms = rooms;
    }

    public void printRoom(){
        for(Map.Entry<Integer,String> entry:rooms.entrySet()){
            System.out.println("Room# "+entry.getKey()+"-"+entry.getValue());
        }
    }
    public void  printInsuranceCompany(){
        for(InsuranceCompanies v:acceptedInsurances){
            System.out.println(v);
        }
    }
    public void printDoctor(){
        for(Doctor d:doctorList){
            System.out.println(d);
        }
    }

    public void printInfo() {
        System.out.println("Hospital: "+"hospitalName='"+hospitalName + '\''+", address=" + address);
        printDoctor();
        printInsuranceCompany();
        printRoom();
    }
}
