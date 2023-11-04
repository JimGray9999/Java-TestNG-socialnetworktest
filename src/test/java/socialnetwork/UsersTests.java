package socialnetwork;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class UsersTests {
    @BeforeTest
    public void testSuiteSetup(){
        System.out.println("Before Test");
    }

    String baseURI = "http://localhost:3001/api/";


    @Test
    public void getAllUsers(){
        String endpoint = baseURI + "users";
        ValidatableResponse response =
                given()
                .when()
                .get(endpoint)
                .then();
        response.log().body();
    }

    @Test
    public void createNewUser(){
        System.out.println("TODO: createNewUser");
    }

    @Test
    public void getOneUser(){
        String userId = "63fc1512f11e3761f0b15d7a";
        String endpoint = baseURI + "users/" + userId;
        ValidatableResponse response =
                given()
                        .when()
                        .get(endpoint)
                        .then();
        response.log().body();
    }

    @Test
    public void updateUser(){
        System.out.println("TODO: updateUser");
    }

    @Test
    public void deleteUser(){
        System.out.println("TODO: deleteUser");
    }

}
