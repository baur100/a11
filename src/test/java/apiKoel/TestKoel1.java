package apiKoel;

import helpers.Token1;
import org.testng.annotations.Test;

public class TestKoel1 {
    @Test
    public void getData(){
        System.out.println(Token1.getToken());
    }
}