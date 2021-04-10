package simpleInheritance040921;

public class simpleInheritancePersonClass040921 {
    private String personFirstName;
    private String personLastName;
    private Integer personAge;

    public simpleInheritancePersonClass040921(String personFirstName, String personLastName, Integer personAge) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.personAge = personAge;
    }

   /* @Override
    public String toString() {
        return "simpleInheritancePersonClass040921{" +
                "personFirstName='" + personFirstName + '\'' +
                ", personLastName='" + personLastName + '\'' +
                ", personAge=" + personAge +
                '}';
    } */

    //this the base class, using getters to make certain we can print the parameters collected at the base class in the inherited classes.
    public String getPersonFirstName() {
        return personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    @Override
    public String toString() {
        return "simpleInheritancePersonClass040921{" +
                "personFirstName='" + personFirstName + '\'' +
                ", personLastName='" + personLastName + '\'' +
                ", personAge=" + personAge +
                '}';
    }
} //end of PersonClass

