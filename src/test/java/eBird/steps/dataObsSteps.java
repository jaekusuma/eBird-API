package eBird.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import java.io.File;
import static eBird.responseAPI.*;
import static eBird.eBirdAPI.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class dataObsSteps {
    @Given("Get recent observation in a region with region code {string}")
    public void getRecentObservationInARegionWithRegionCode(String regionCode){
        SerenityRest.given().pathParam("regionCode",regionCode);
    }

    @When("Send get Recent observations in a region")
    public void sendGetRecentObservationsInARegion() {
        SerenityRest.when().get(RECENT_OBS);
    }

    @Then("Status Code Should Be {int} OK")
    public void statusCodeShouldBeOK(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }

    @And("Response Body Return Body SpeciesCode {string}")
    public void responseBodyReturnBodySpeciesCode(String arg0) {
        SerenityRest.then().body(SPECIES_CODE, equalTo(arg0));
    }

    @And("Validate Json Schema")
    public void validateJsonSchema() {
        File json = new File(JSON_SCHEMA);
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
