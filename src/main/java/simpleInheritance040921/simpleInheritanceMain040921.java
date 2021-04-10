package simpleInheritance040921;

public class simpleInheritanceMain040921 {
    public static void main(String[] args) {
        System.out.println("Hi There");
        //creating a person below
        simpleInheritancePersonClass040921 ErnestoVera = new simpleInheritancePersonClass040921("Ernesto", "Vera",24);
        System.out.println(ErnestoVera);

        //creating a student below

        simpleInheritanceStudentClass040921040921 WillyWonka = new simpleInheritanceStudentClass040921040921("Willy", "Wonka",25, "Chemistry","Westwood Academy");
        System.out.println(WillyWonka);

        //creating teacher below
        simpleInheritanceTeacherClass040921040921 MrsValerieWooten = new simpleInheritanceTeacherClass040921040921("Valerie", "Wooten", 45, "History", "Overland Ave", true);
        System.out.println(MrsValerieWooten);

    } //end of main

} //end of class
