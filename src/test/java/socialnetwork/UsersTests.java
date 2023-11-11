package socialnetwork;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class UsersTests {
    @BeforeTest
    public void testSuiteSetup(){
        System.out.println("Before Test");
    }

    String baseURI = "http://localhost:3001/api/";
    String endpoint = baseURI + "users";


    @Test
    public void getAllUsers(){
        System.out.println("getAllUsers");
        ValidatableResponse response =
                given()
                .when()
                .get(endpoint)
                .then().statusCode(200);
    }

    @Test
    public void createNewUser(){
        System.out.println("createNewUser");
        Map<String, Object> payload = new HashMap<>();
        payload.put("username", "Test123ToDelete");
        payload.put("email", "test123ToDelete@mailinator.com");
        ValidatableResponse response =
                given()
                        .contentType("application/json")
                        .body(payload)
                        .when()
                        .post(endpoint)
                        .then().statusCode(200);
        response.log().body();
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
        System.out.println("updateUser");
        String userId = "654c39fba549bc6f10ccf7a5";
        String endpoint = baseURI + "users/" + userId;
        Map<String, Object> payload = new HashMap<>();
        payload.put("username", "Test123ToDeleteUpdated");
        payload.put("email", "test123ToDeleteUpdated@mailinator.com");
        ValidatableResponse response =
                given()
                        .contentType("application/json")
                        .body(payload)
                        .when()
                        .put(endpoint)
                        .then().statusCode(200);
        response.log().body();

    }

    @Test
    public void deleteUser(){
        System.out.println("deleteUser");
        System.out.println("updateUser");
        String userId = "654c39fba549bc6f10ccf7a5";
        String endpoint = baseURI + "users/" + userId;
        Map<String, Object> payload = new HashMap<>();
        payload.put("username", "Test123ToDeleteUpdated");
        payload.put("email", "test123ToDeleteUpdated@mailinator.com");
        ValidatableResponse response =
                given()
                        .contentType("application/json")
                        .body(payload)
                        .when()
                        .delete(endpoint)
                        .then().statusCode(200);
        response.log().body();
    }


}
