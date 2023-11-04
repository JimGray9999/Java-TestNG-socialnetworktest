package socialnetwork;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ThoughtsTests {
    String baseURI = "http://localhost:3001/api/";

    @Test
    public void getAllThoughts(){
        String endpoint = baseURI + "thoughts";
        ValidatableResponse response =
                given().
                        when().
                        get(endpoint).
                        then();
        response.log().body();
    }

    @Test
    public void getOneThought(){
        String thoughtId = "63fc18b1f11e3761f0b15d7f";
        String endpoint = baseURI + "thoughts/" + thoughtId;
        ValidatableResponse response =
                given()
                        .when()
                        .get(endpoint)
                        .then();
        response.log().body();
    }

    @Test
    public void updateThought(){
        System.out.println("TODO: updateThought");
    }

    @Test
    public void deleteThought(){
        System.out.println("TODO: deleteThought");
    }
}
