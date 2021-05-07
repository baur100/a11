package helpers;

import com.github.javafaker.Faker;
import enums.OrderStatus;
import enums.Status;
import models.Category;
import models.Order;
import models.Pet;
import models.Tag;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;



public class TestDataGenerators {
    public static String getRandomString(int lenght){
        boolean useLetters = true;
        boolean useNumber = false;
        return RandomStringUtils.random(lenght, useLetters,useNumber);
    }

    public static Pet generateRandomPet(){
        Faker faker = new Faker();
        Random random =new Random();
        Category category = new Category(random.nextInt(10),faker.funnyName().name());
        String petName = faker.animal().name();
        String[] photoUrls ={faker.internet().url()};
        Tag tag = new Tag(random.nextInt(), faker.book().title());
        Tag[]tags = {tag};
        return new Pet(petName,Status.available,photoUrls,category,tags);

    }
    public static Order generateRandomOrder(){
        Random random = new Random();
        int id = random.nextInt(10);
        int petId = random.nextInt();
        int quantity = random.nextInt(3)+1;
//        OrderStatus status = randomStatus();
        boolean complete = random.nextBoolean();
        return new Order(id,petId,quantity,OrderStatus.placed,complete);
    }
//    public static OrderStatus randomStatus(){
//        int status =new Random().nextInt(OrderStatus.values().length);
//        return OrderStatus.values()[status];
//    }

}
