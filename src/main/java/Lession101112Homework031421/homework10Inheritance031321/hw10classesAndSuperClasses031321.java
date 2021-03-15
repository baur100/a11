package Lession101112Homework031421.homework10Inheritance031321;
/*1. Create a super class and 3 child classes
create 2 object of each class (including superclass - don't make it abstract) */

public class hw10classesAndSuperClasses031321 {
    public static void main(String[] args) {

        //SimpleClass used for testing. Remove later.
        //SimpleClass031321 testclass = new SimpleClass031321("One", "Two", "Three");
        //System.out.println(testclass);

         //creating 2 instances of student below:

        studentClass031321 highSchoolStudent = new studentClass031321("Lisa", "Smith", "03/13/2006", "675-32-9871", "History 221", 45);
        System.out.println("Students below:");
        System.out.println(highSchoolStudent);

        studentClass031321 collegeStudent = new studentClass031321("Robert", "Ballard", "07/21/2006", "452-01-5471", "Math 1A", 73);
        System.out.println(collegeStudent);

       //Creating 2 instances of teacher below:
       System.out.println("Teachers below:");
       teacherClass031321 highSchoolTeacher = new teacherClass031321("Betty", "Hanf", "05/27/67", "456-87-9087" , true, 1998, "Wildwood", "History" );
       System.out.println(highSchoolTeacher);
       teacherClass031321 collegeTeacher = new teacherClass031321("William", "Foster", "03/11/63", "352-67-2035" , false, 0, "UCSD", "Biology" );
        System.out.println(collegeTeacher);

       //Creating 2 instances of principal below:

        principalClass031321 highSchoolPrincipal = new principalClass031321("Robert", "Stock", "12/06/59","543-75-0675",false, 0,"Wilwood",45000);
        System.out.println("Principals Below:");
        System.out.println(highSchoolPrincipal);
        principalClass031321 collegePrincipal = new principalClass031321("Steven", "Atkinson", "2/17/53","714-15-1643",true, 1974,"UCSD",89000);
        System.out.println(collegePrincipal);

    }
}
