package simpleSeleniumApolloTest040321;

public class mainSeleniumApolloTest040321 {
    public static void main(String[] args) {
        System.out.println("Hi There");
        //creating new instance of landingPageTest below
        pageLoginTest040321 landingPageTest = new pageLoginTest040321("https://www.apollopros.com/member/login.aspx");

        //passing valid parameters to the landing page below
        landingPageTest.loginTesting("klingergk@mail.com","GeorgeSmith123!");

        //passing invalid parameters to the landing page below
        //landingPageTest.loginTesting("klingergk123@mail.com","GeorgeSmithWrongPassword!");

    }
}
