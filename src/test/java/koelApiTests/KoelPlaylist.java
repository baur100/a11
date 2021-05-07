package koelApiTests;

import com.github.javafaker.Faker;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.PlaylistResponse;
import models.UpdatePlaylist;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class KoelPlaylist {
    private String token;
    Faker faker;
    private int playlistId;
    private String playlistName;


    @BeforeClass
    public void runOnce(){
        token= Token.getToken();
        faker=new Faker();
    }
    @BeforeMethod
    public void startUp(){
        playlistName = faker.friends().character();
        CreatePlaylistRequest playlist = new CreatePlaylistRequest(playlistName);
        System.out.println(playlistName);
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                        .header("Authorization",token)
                        .body(playlist)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath =response.jsonPath();
        PlaylistResponse resp = jsonPath.getObject("$", PlaylistResponse.class);
        System.out.println(resp.getId());
        Assert.assertEquals(playlistName, resp.getName());
        playlistId = jsonPath.getInt("id");
    }
    @AfterMethod
    public void cleanUp(){
        given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("accept","application/json")
                .header("Content-Type", "application/json")
                .header("Authorization",token)
                .when()
                .delete()
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

    @Test
    public void getPlaylistTest(){
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                        .header("Authorization",token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jasonPath=response.jsonPath();
        PlaylistResponse[] playlists = jasonPath.getObject("$",PlaylistResponse[].class);
//        System.out.println(playlists.length);
        for (PlaylistResponse pl:playlists){
            if(pl.getId()==playlistId){
                System.out.println("It is match");
                Assert.assertEquals(playlistName,pl.getName());
            }
        }
    }

    @Test
    public void updatePlaylistTest(){
        String updatePlaylistName = faker.music().instrument();
        UpdatePlaylist updatePlaylist = new UpdatePlaylist(updatePlaylistName);
        System.out.println(updatePlaylistName);
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist/"+playlistId)
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                        .header("Authorization",token)
                        .body(updatePlaylist)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        UpdatePlaylist updatePlaylistResponse = jsonPath.getObject("$",UpdatePlaylist.class);
        Assert.assertEquals(updatePlaylistName,updatePlaylistResponse.getName());
        System.out.println(updatePlaylistResponse.getName());

    }
    @Test
    public void purgeAll() throws InterruptedException {
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                        .header("Authorization",token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        PlaylistResponse[] playlists = jsonPath.getObject("$",PlaylistResponse[].class);
        System.out.println(playlists.length);
        for(PlaylistResponse pl:playlists){
            Thread.sleep(3000);
            given()
                    .baseUri("https://bbb.testpro.io/")
                    .basePath("api/playlist/"+pl.getId())
                    .header("accept","application/json")
                    .header("Content-Type", "application/json")
                    .header("Authorization",token)
                    .when()
                    .delete()
                    .then()
                    .statusCode(200)
                    .extract()
                    .response();
        }
    }

}
