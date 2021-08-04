package helpers;

import com.github.javafaker.Faker;
import enums.Status;
import enums.Status1;
import models.Category1;
import models.Pet1;
import models.Tag1;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGenerator1 {
    public static String getRandomString(int length) {

        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public static int getRandomNumber(){
        int min = 60;
        int max = 601;
        Random rand = new Random();
        int randomNumber = rand.nextInt(max) + min;
        return randomNumber;
    }

    public static Pet1 generateRandomPet(){
        Faker faker = new Faker();
        Random random = new Random();
        Category1 category = new Category1(random.nextInt(),faker.funnyName().name());
        String petName = faker.animal().name();
        String[] photoUrls = {faker.internet().url()};
        Tag1 tag = new Tag1(random.nextInt(), faker.space().constellation());
        Tag1[] tags = {tag};
        return new Pet1(petName, photoUrls, category, tags, Status1.available);
    }
}
