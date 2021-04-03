package simpleExamplePassingParametersToObjects040221;

public class simpleObjectsForPassingParameters040221 {

    private String userName;
    private String passWord;
    private Boolean testResult;

    public simpleObjectsForPassingParameters040221 (String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        testResult = true;
        System.out.println("username is " + userName + " passWord is " + passWord + " testResult is " + testResult);


    } //end of constructor

    public String getUserName () {
        return userName;
    }

    public void setUserName (String userName){
        this.userName = userName;
    }

    public String getPassWord () {
        return passWord;
    }

    public void setPassWord (String passWord){
        this.passWord = passWord;
    }


    @Override
    public String toString() {
        return "apolloSolutionsLoginTest040221{" +
                "testResult=" + testResult +
                '}';
    } //end of toString
} //end of object


