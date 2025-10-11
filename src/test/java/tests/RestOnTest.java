package tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class RestOnTest {
    @Test
    public void logOn() {
        given().log().all()
                .contentType(ContentType.JSON) // Указываем тип контента
                .body("{\n" +
                        "    \"email\": \"banya@mail.ru\",\n" +
                        "    \"password\": \"123456!@#\"\n" +
                        "}")
                .when()
                .post("https://dev.skyrexio.com/user/login")
                .then().log().all()
                .statusCode(200)
                .body("data.toString()", containsString("role:user"));
    }
}
