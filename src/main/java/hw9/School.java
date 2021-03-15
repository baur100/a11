package hw9;

public class School {
    private String nameOfSchool;
    private String type;
    private String location;

    public School(String nameOfSchool, String type, String location) {
        this.nameOfSchool = nameOfSchool;
        this.type = type;
        this.location = location;
    }
    public School(){

    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    String returnSchool (String nameOfSchool, String type, String location){
        String schoolParameters;
        schoolParameters = "School Name: "+nameOfSchool+ "\nType of School: "+type+"\nLocation: "+location;
        return schoolParameters;

    }
    public void attend(){
        System.out.println(nameOfSchool+ " " +type+" "+location );

    }
}
