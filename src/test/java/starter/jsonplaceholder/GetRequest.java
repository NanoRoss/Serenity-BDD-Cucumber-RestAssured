package starter.jsonplaceholder;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetRequest {

    private static String JSONPLACEHOLDER_BY_POST_ID = "https://jsonplaceholder.typicode.com/posts/{id}";

    @Step("Get Rrequest by {0}")
    public void getRequestByPostID(String id) {
        SerenityRest.given()
                .pathParam("id", id)
                .get(JSONPLACEHOLDER_BY_POST_ID);
    }

}
