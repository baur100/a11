package homework3_17_21;

public class Hospital {
    private String hospitalName;
    private Address address;

    public Hospital() {
    }

    public void printHospitalInfo(String hospitalName, Address address) {
        System.out.println(hospitalName + ": " + address);
    }
}
