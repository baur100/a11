package lesson10;

import java.util.Arrays;

public class Cardiologist extends Doctor{
    private String[] conditions ;


    public Cardiologist(String[] conditions) {
        this.conditions = conditions;
    }

    public Cardiologist(String hospital_name, int salary, int patients, String[] conditions) {
        super(hospital_name, salary, patients);
        this.conditions = conditions;
    }

    public String[] getConditions() {
        return conditions;
    }

    public void setConditions(String[] conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "Cardiologist " +
                "and he treats conditions like: " + Arrays.toString(conditions) ;
    }
}
