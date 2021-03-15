package lesson10;

import java.util.Arrays;

public class Oncologist extends Doctor
{
    private String[] areas;

    public Oncologist(String[] areas) {
        this.areas = areas;
    }

    public Oncologist(String hospital_name, int salary, int patients, String[] areas) {
        super(hospital_name, salary, patients);
        this.areas = areas;
    }

    public String[] getAreas() {
        return areas;
    }

    public void setAreas(String[] areas) {
        this.areas = areas;
    }

    @Override
    public String toString() {
        return "Oncologist " +
                "and his areas are: " + Arrays.toString(areas);

    }
}
