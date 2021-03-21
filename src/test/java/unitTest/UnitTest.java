package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Tickets;

public class UnitTest {
    @Test
    public void unitTest_testInfant_priceZero(){
        // Arrange ()
        Tickets infant = new Tickets(1, 1000);
        // Act (Then)
        double result = infant.getPrice();
        // Assert (When)
        Assert.assertEquals(result, 0.0);
    }

    @Test
    public void unitTest_testChild_halfPrice(){
        //Arrange
        Tickets child = new Tickets(8, 1000);
        //Act
        double result = child.getPrice();
        //Assert
        Assert.assertEquals(result, 500.0);
    }
    @Test
    public void unitTest_testAdult_fullPrice(){
        //Arrange
        Tickets adult = new Tickets(25, 1000);
        //Act
        double result = adult.getPrice();
        //Assert
        Assert.assertEquals(result, 1000.0);
    }
    @Test
    public void unitTest_testSenior_80percent(){
        //Arrange
        Tickets senior = new Tickets(70, 1000);
        //Act
        double result = senior.getPrice();
        //Assert
        Assert.assertEquals(result, 800.0);
    }
}
