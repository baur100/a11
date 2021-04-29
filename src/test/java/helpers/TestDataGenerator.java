package helpers;

import com.github.javafaker.Faker;
import enums.Status;
import models.Category;
import models.Pet;
import models.Tag;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGenerator {
    public static String getRandomString(int length) {
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static Pet generateRandomPet(){
        Faker faker = new Faker();
        Random random = new Random();
        Category category = new Category(random.nextInt(),faker.funnyName().name());
        String petName = faker.animal().name();
        String[]photoUrls = {faker.internet().url()};
        Tag tag = new Tag(random.nextInt(), faker.book().title());
        Tag[]tags = {tag};
        return new Pet(Status.available,petName,photoUrls,category,tags);
    }
}
