package eBird.steps;

import eBird.action;
import static eBird.eBirdAPI.*;
import io.cucumber.java.en.*;

public class refGeo {
	@Given("Get Adjacent Regions {string}")
	public void getAdjacentRegions(String regionCode) {
		action.givenRegion(regionCode);
	}

	@When("Send Adjacent Regions")
	public void sendAdjacentRegions() {
		action.whenSend(GEO_ADJACENT);
	}

	@And("Validate Adjacent Regions Json Schema")
	public void validateAdjacentRegionsJsonSchema() {
		action.jsonSchemaValidate("/refGeo.json");
	}
}
