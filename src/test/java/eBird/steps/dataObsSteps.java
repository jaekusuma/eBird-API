package eBird.steps;

import eBird.action;
import io.cucumber.java.en.*;
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
        action.jsonSchemaValidate("/dataObsRecent.json");
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
        action.responContainsString(arg0);
        action.responContainsString(arg1);
    }

    @Given("Get Recent nearby observations Soecies {string} in lat {string} and lng {string}")
    public void getRecentNearbyObservationsSoeciesInLatAndLng(String arg0, String arg1, String arg2) {
        action.givenSpeciesNearby(arg0, arg1, arg2);
    }

    @When("Send get Recent nearby observations of a species")
    public void sendGetRecentNearbyObservationsOfASpecies() {
        action.whenSend(RECENT_OBS_SPECIES_NEARBY);
    }

    @And("Response Body Return Body Soecies {string} lat {string} and lng {string}")
    public void responseBodyReturnBodySoeciesLatAndLng(String arg0, String arg1, String arg2) {
        action.responBodyContains(SPECIES_CODE,arg0);
        action.responContainsString(arg1);
        action.responContainsString(arg2);
    }

    @Given("Get Nearest observations of a species {string} in lat {string} and lng {string}")
    public void getNearestObservationsOfASpeciesInLatAndLng(String arg0, String arg1, String arg2) {
        action.givenSpeciesNearby(arg0, arg1, arg2);
    }

    @When("Send get Nearest observations of a species")
    public void sendGetNearestObservationsOfASpecies() {
        action.whenSend(RECENT_OBS_NEAREST);
    }

    @Given("Get Recent nearby notable observations in lat {string} and lng {string}")
    public void getRecentNearbyNotableObservationsInLatAndLng(String arg0, String arg1) {
        action.givenRegionNearby(arg0, arg1);
    }

    @When("Send get Recent nearby notable observations")
    public void sendGetRecentNearbyNotableObservations() {
        action.whenSend(RECENT_NEARBY_NOTABLE);
    }

    @Given("Get Recent checklists feed with region code {string}")
    public void getRecentChecklistsFeedWithRegionCode(String arg0) {
        action.givenRegion(arg0);
    }

    @When("Send get Recent checklists feed")
    public void sendGetRecentChecklistsFeed() {
        action.whenSend(RECENT_CHECKLIST);
    }

    @And("Response Body Return Body locId {string}")
    public void responseBodyReturnBodyLocId(String arg0) {
        action.responBodyContains(LOCID,arg0);
    }

    @And("Validate Recent checklists feed Json Schema")
    public void validateRecentChecklistsFeedJsonSchema() {
        action.jsonSchemaValidate("/dataObsRecentChecklist.json");
    }

    @Given("Get Historic observations of a region code {string} in year {string} month {string} day {string}")
    public void getHistoricObservationsOfARegionCodeInYearMonthDay(String arg0, String arg1, String arg2, String arg3) {
        action.givenRegionYMD(arg0, arg1, arg2, arg3);
    }

    @When("Send get Historic observations on a date")
    public void sendGetHistoricObservationsOnADate() {
        action.whenSend(HISTORY_OBS_DATE);
    }

    @And("Response Body Return Body obsDt {string}")
    public void responseBodyReturnBodyObsDt(String arg0) {
        action.responContainsString(arg0);
    }
}
