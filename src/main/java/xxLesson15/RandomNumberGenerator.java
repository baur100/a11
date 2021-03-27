package xxLesson15;

import java.util.Date;

//objective: generate random numbers without using the random number generator.
//use the time feature..get
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Date time = new Date();
        String random = (time.getTime()+"").substring(9);
       Long random1 = time.getTime();
        System.out.println("Number of seconds from Jan 1, 1970: removing the first nine digits " + random);
        System.out.println("Total Number of seconds from Jan 1, 1970 " + random1);

    }
}
