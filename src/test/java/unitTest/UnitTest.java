package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Tickets;

public class UnitTest {
    @Test
    public void unitTest_testInfant_priceZero(){
        // Arrange
        Tickets infant = new Tickets(1,1000);
        // Act
        double result = infant.getPrice();
        // Assert
        Assert.assertEquals(result,0.0);
    }

    @Test
    public void unitTest_testChild_halfPrice(){
        Tickets child = new Tickets(8,1000);
        double result = child.getPrice();
        Assert.assertEquals(result,500.0);
    }
    @Test
    public void unitTest_testAdult_fullPrice(){
        Tickets adult = new Tickets(25,1000);
        double result = adult.getPrice();
        Assert.assertEquals(result,1000.0);
    }
    @Test
    public void unitTest_testSenior_80percent(){
        Tickets senior = new Tickets(70,1000);
        double result = senior.getPrice();
        Assert.assertEquals(result,800.0);
    }
}
