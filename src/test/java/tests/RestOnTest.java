package tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class RestOnTest extends BaseTest {

    @Test
    public void logOn() {
        given().log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        loginJson +
                        passJson +
                        "}")
                .when()
                .post(devUrl)
                .then().log().all()
                .statusCode(200)
                .body("data.toString()", containsString("role:user"));
    }
}
