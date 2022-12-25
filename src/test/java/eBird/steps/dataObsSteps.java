package eBird.steps;

import eBird.action;
import io.cucumber.java.en.*;
import java.io.File;
import static eBird.responseAPI.*;
import static eBird.eBirdAPI.*;

public class dataObsSteps {
    @Given("Get recent observation in a region with region code {string}")
    public void getRecentObservationInARegionWithRegionCode(String regionCode){
        action.givenRegion(regionCode);
    }

    @When("Send get Recent observations in a region")
    public void sendGetRecentObservationsInARegion() {
        action.whenSend(RECENT_OBS);
    }

    @Then("Status Code Should Be {int} OK")
    public void statusCodeShouldBeOK(int arg0) {
        action.statusCode(arg0);
    }

    @And("Response Body Return Body SpeciesCode {string}")
    public void responseBodyReturnBodySpeciesCode(String arg0) {
        action.responBodyContains(SPECIES_CODE,arg0);
    }

    @And("Validate Json Schema")
    public void validateJsonSchema() {
        File json = new File(JSON_SCHEMA+"/dataObsRecent.json");
        action.jsonSchemaValidate(json);
    }

    @When("Send get Recent notable observations in a region")
    public void sendGetRecentNotableObservationsInARegion() {
        action.whenSend(RECENT_OBS_NOTABLE);
    }

    @Given("Get recent observation in a region with region code {string} and species Code {string}")
    public void getRecentObservationInARegionWithRegionCodeAndSpeciesCode(String arg0, String arg1) {
        action.givenRegionAndSpecies(arg0,arg1);
    }

    @When("Send get Recent observations of a species in a region")
    public void sendGetRecentObservationsOfASpeciesInARegion() {
        action.whenSend(RECENT_OBS_SPECIES);
    }

    @Given("Get Recent nearby observations in lat {string} and lng {string}")
    public void getRecentNearbyObservationsInLatAndLng(String arg0, String arg1) {
        action.givenRegionNearby(arg0, arg1);
    }

    @When("Send get Recent nearby observations")
    public void sendGetRecentNearbyObservations() {
        action.whenSend(RECENT_OBS_NEARBY);
    }

    @And("Response Body Return Body lat {string} and lng {string}")
    public void responseBodyReturnBodyLatAndLng(String arg0, String arg1) {
        action.responBodyContains(LAT,arg0);
        action.responBodyContains(LNG,arg1);
    }
}
