package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class TestDataGenerator1 {
    public static String getRandomString(int length) {

        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
}
