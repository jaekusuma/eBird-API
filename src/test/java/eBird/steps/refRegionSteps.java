package eBird.steps;

import eBird.action;
import static eBird.responseAPI.*;
import static eBird.eBirdAPI.*;
import io.cucumber.java.en.*;

public class refRegionSteps {
	@Given("Get Region Info with region code {string}")
	public void getRegionInfoWithRegionCode(String regionCOde) {
		action.givenRegion(regionCOde);
	}

	@When("Send Region Info")
	public void sendRegionInfo() {
		action.whenSend(REGION_INFO);
	}

	@And("Response Body Return result {string}")
	public void responseBodyReturnResult(String arg1) {
		action.responBodyEqual(RESULT, arg1);
	}

	@And("validate Region Info Json Schema")
	public void validateRegionInfoJsonSchema() {
		action.jsonSchemaValidate("/refRegionInfo.json");
	}

	@Given("Get Sub Region List with regionType {string} parentRegionCode {string}")
	public void getSubRegionListWithRegionTypeParentRegionCode(String arg1, String arg2) {
		action.givenTypeSub(arg1, arg2);
	}

	@When("Send Sub Region List")
	public void sendSubRegionList() {
		action.whenSend(REGION_SUB);
	}

	@And("validate Sub Region List Json Schema")
	public void validateSubRegionListJsonSchema() {
		action.jsonSchemaValidate("/refRegionSub.json");
	}
}
