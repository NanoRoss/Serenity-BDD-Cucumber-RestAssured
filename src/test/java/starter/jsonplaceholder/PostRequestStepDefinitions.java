package starter.jsonplaceholder;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.containsString;


public class PostRequestStepDefinitions {


    @Steps
    PostRequests postRequests;
    @Given("POST request with json data")
    public void postRequests() throws IOException {
        postRequests.postRequestWithJsonData();
    }

    @Then("Status code ShouldBe 201")
    public void theResultingPostRequestShouldBe() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @And("{string} in the response body is correct")
    public void theResponseBodyIsCorrect(String title) {
        restAssuredThat(response -> response.body("'title'", containsString(title)));
    }

    @And("The {string} in the response body is correct")
    public void theResponseBdodyIsCorrect(String body) {
        restAssuredThat(response -> response.body("'body'", containsString(body)));
    }
}
