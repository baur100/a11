package hw10SuperClass;

public class Manager {
    private String status;
    private int year;
    private String packag;
    private String packageSize;

public Manager(String status, int year, String packag, String packageSize){
    this.status = status;
    this.year = year;
    this.packag = packag;
    this.packageSize = packageSize;
}

    public String getStatus() {
        return status;
    }

    public int getYear() {
        return year;
    }

    public String getPackag() {
        return packag;
    }

    public String getPackageSize() {
        return packageSize;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "status='" + status + '\'' +
                ", year=" + year +
                ", packag='" + packag + '\'' +
                ", packageSize='" + packageSize + '\'' +
                '}';
    }
}