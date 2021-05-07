package apiTestOrderStore;

import helpers.TestDataGenerators;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Order;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestOrder {
    private int orderId;
    private Order order;

    @BeforeMethod
    public void storeTest_createOrder_orderCreated(){
        order = TestDataGenerators.generateRandomOrder();
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/store/order")
                        .body(order)
                        .header("accept", "application/json")
                        .header("Content-Type", "application/json")
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        orderId = response.jsonPath().getInt("id");
    }
    @Test
    public void storeTest_getOrderById_orderReturned(){
        Response response =
            given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .basePath("/store/order/"+orderId)
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
            .when()
                .get()
            .then()
                .statusCode(200)
                .extract()
                .response();
//        System.out.println(response.asPrettyString());
        JsonPath jsonPath = response.jsonPath();
        Order responseOrder = jsonPath.getObject("$",Order.class);
        System.out.println(response.jsonPath().prettify());
        Assert.assertEquals(order.getId(),responseOrder.getId());
        Assert.assertEquals(order.getPetId(),responseOrder.getPetId());
        Assert.assertEquals(order.getQuantity(),responseOrder.getQuantity());
        Assert.assertEquals(order.getStatus(),responseOrder.getStatus());
    }
    @AfterMethod
    public void storeTest_deleteOrder_orderDeleted(){
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/store/order/"+orderId)
                        .header("accept", "application/json")
                        .header("Content-Type", "application/json")
                        .when()
                        .delete()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
    }
}
