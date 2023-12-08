package socialnetwork;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FriendsTests {
    @BeforeTest
    public void testSuiteSetup(){
        System.out.println("Before Test");
    }

    String baseURI = "http://localhost:3001/api/";
    String endpoint = baseURI + "users";

    @Test
    public void addFriend(){
        System.out.println("addFriend");
        endpoint += "/63fc1512f11e3761f0b15d7a/" + "friends" + "/65482cc002f9de16405eae7e";
        ValidatableResponse response =
                given()
                        .contentType("application/json")
                        .when()
                        .post(endpoint)
                        .then().statusCode(200);
        response.log().body();
    }

    @Test
    public void deleteFriend() {
        System.out.println("deleteFriend");
        endpoint += "/63fc1512f11e3761f0b15d7a/" + "friends" + "/65482cc002f9de16405eae7e";
        ValidatableResponse response =
                given()
                        .contentType("application/json")
                        .when()
                        .delete(endpoint)
                        .then().statusCode(200);
        response.log().body();
    }
}
