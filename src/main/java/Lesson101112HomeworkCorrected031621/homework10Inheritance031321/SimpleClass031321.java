package Lesson101112HomeworkCorrected031621.homework10Inheritance031321;

public class SimpleClass031321 {
    private String firstVariable;
    private String secondVariable;
    private String ThirdVariable;

    public SimpleClass031321(String firstVariable, String secondVariable, String thirdVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        ThirdVariable = thirdVariable;
    }

    public String getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(String firstVariable) {
        this.firstVariable = firstVariable;
    }

    public String getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(String secondVariable) {
        this.secondVariable = secondVariable;
    }

    public String getThirdVariable() {
        return ThirdVariable;
    }

    public void setThirdVariable(String thirdVariable) {
        ThirdVariable = thirdVariable;
    }

    @Override
    public String toString() {
        return "SimpleClass031321{" +
                "firstVariable='" + firstVariable + '\'' +
                ", secondVariable='" + secondVariable + '\'' +
                ", ThirdVariable='" + ThirdVariable + '\'' +
                '}';
    }
}

