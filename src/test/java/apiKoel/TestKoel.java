package apiKoel;

import helpers.Token;
import org.testng.annotations.Test;

public class TestKoel {
    @Test
    public void getData(){
        System.out.println(Token.get());
    }
}
