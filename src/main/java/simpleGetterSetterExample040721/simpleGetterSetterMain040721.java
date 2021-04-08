package simpleGetterSetterExample040721;
//see https://www.w3schools.com/java/java_encapsulation.asp
public class simpleGetterSetterMain040721 {
    public static void main(String[] args) {
        System.out.println("Hi There");
        simpleGetterSetterClass040721 newPerson = new simpleGetterSetterClass040721();
        newPerson.setName("John");
        System.out.println(newPerson.getName());
    }
}
