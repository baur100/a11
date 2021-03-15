package hw10Enums;

import java.util.Arrays;

public class Manager {
    private String status;
    private int year;
    private String packag;
    private PackageSize[] packageSize;

    public Manager(String status, int year, String packag, PackageSize[] packageSize) {
        this.status = status;
        this.year = year;
        this.packag = packag;
        this.packageSize = packageSize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPackag() {
        return packag;
    }

    public void setPackag(String packag) {
        this.packag = packag;
    }

    public PackageSize[] getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(PackageSize[] packageSize) {
        this.packageSize = packageSize;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "status='" + status + '\'' +
                ", year=" + year +
                ", packag='" + packag + '\'' +
                ", packageSize=" + Arrays.toString(packageSize) +
                '}';
    }
}