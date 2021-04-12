package unitTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tickets.Tickets;

public class ParametrizedUnitTest {
    @DataProvider(name = "ages")
    public Object[][] getData(){
        return new Object[][]{
                {1, 0.0},
                {2, 0.0},
                {3, 500.0},
                {5, 500.0},
                {25, 1000.0},
                {72, 800.0}
        };
    }


    @Test(dataProvider = "ages")
    public void testTicket(int age, double price){
        Tickets person = new Tickets(age,1000);
        double thePrice = person.getPrice();
        Assert.assertEquals(thePrice,price);

    }
}
