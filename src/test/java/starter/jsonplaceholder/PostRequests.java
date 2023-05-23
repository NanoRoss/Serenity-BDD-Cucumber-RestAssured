package starter.jsonplaceholder;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PostRequests {


    private static String JSONPLACEHOLDER_URI = "https://jsonplaceholder.typicode.com/posts";

    @Step("POST request with json data")
    public void postRequestWithJsonData() throws IOException {
        String payload = new String(Files.readAllBytes(Paths.get("src/test/resources/testDataResources/dataPost.json")));
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .post(JSONPLACEHOLDER_URI);
    }
}
