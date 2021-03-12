package Homework3_10;

public class AppEmployee {
    public static void main(String[] args) {
        Employee john = new Employee();

        john.setName("John");
        john.setLastname("Wilson");
        john.setPosition("QA engineer");
        john.setDateOfBirthday("May,15");
        john.setYearOfStart(2015);
        System.out.println(john.getName());
        System.out.println(john.getLastname());
        System.out.println(john.getPosition());
        System.out.println(john.getDateOfBirthday());
        System.out.println(john.getYearOfStart());

        Employee michel = new Employee("Michel", "Johnson", "Supervisor", "July,8", 2012);

        System.out.println(michel.getName());
        System.out.println(michel.getLastname());
        System.out.println(michel.getPosition());
        System.out.println(michel.getDateOfBirthday());
        System.out.println(michel.getYearOfStart());

        String employee = john.getEmployeeInfo();
        System.out.println(employee);

    }
}
