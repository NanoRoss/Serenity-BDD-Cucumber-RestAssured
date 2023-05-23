package starter.jsonplaceholder;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.containsString;


public class GetRequestStepDefinitions {


    @Steps
    GetRequest getRequest;
    @When("Get Rrequest by id {word}")
    public void getrequest(String id) {
        getRequest.getRequestByPostID(id);
    }

    @Then("Status code ShouldBe 200")
    public void theResultingGetRequestShouldBe() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @And("The tittle should contain {string}")
    public void theTittleIsTheCorrectTitle(String title) {
        restAssuredThat(response -> response.body("'title'", containsString(title)));
    }
}
