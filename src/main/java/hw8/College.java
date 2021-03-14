package hw8;

public class College {
    public String name;
    public String state;
    public int yearStart;
    public int yearGraduate;
    public double tuition;
    public String mascot;
    public String major;

    public String getFirstChoice(){
        return "Your first choice of College is: " +name + "\nIn: " + state;
    }

    public String getMajor(){
        return "You have chosen: " +major +" as your course of study";
    }

    public String getDetails(){
        return "You will start College in: " +yearStart+ "\n You will graduate College in: "+yearGraduate+ "\nYou will pay: " + tuition;
    }

    public String getMascot(){
        return "Your School's Mascot is: "+ mascot;
    }

}
