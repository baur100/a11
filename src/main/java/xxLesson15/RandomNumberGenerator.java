package xxLesson15;

import java.util.Date;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Date time = new Date();
        String random = (time.getTime()+"").substring(9);
        System.out.println(random);
    }
}
