package lesson16_hw;

public class Hospital {
    private String hospitalName;
    private String address;


    public Hospital(String hospitalName, String address) {
        this.hospitalName = hospitalName;
        this.address = address;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}



