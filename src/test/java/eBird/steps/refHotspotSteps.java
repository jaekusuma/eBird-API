package eBird.steps;

import eBird.action;
import static eBird.eBirdAPI.*;
import io.cucumber.java.en.*;

public class refHotspotSteps {
	@Given("Get Hotspots in a region {string}")
	public void getHotspotsInARegion(String regionCode) {
		action.givenRegion(regionCode);
	}

	@When("Send Get Hotspots in a region")
	public void sendGetHotspotsInARegion(){
		action.whenSend(HOTSPOT_REGION);
	}

	@Given("Get Nearby hotspots in lat {string} and lng {string}")
	public void getNearbyHotspotsInLatAndLng(String arg1, String arg2) {
		action.givenRegionNearby(arg1, arg2);
	}
	@When("^Send Nearby hotspots$")
	public void sendNearbyHotspots() {
		action.whenSend(HOTSPOT_NEARBY);
	}
	@And("Response Body Return lat {string} and lng {string}")
	public void responseBodyReturnLatAndLng(String arg1, String arg2) {
		action.responContainsString(arg1);
		action.responContainsString(arg2);
	}

	@Given("Get Hotspot Info with locId {string}")
	public void getHotspotInfoWithLocId(String arg1) {
		action.givenLocId(arg1);
	}

	@When("Send Hotspot Info")
	public void sendHotspotInfo() {
		action.whenSend(HOTSPOT_INFO);
	}

	@And("Response Body Return Body locID {string}")
	public void responseBodyReturnBodyLocID(String arg1) {
		action.responContainsString(arg1);
	}

	@And("Validate Hotspot Info Json Schema")
	public void validateHotspotInfoJsonSchema() {
		action.jsonSchemaValidate("/refHotspotInfo.json");
	}
}
