package eBird.steps;

import eBird.action;
import io.cucumber.java.en.*;
import java.io.File;
import static eBird.responseAPI.*;
import static eBird.eBirdAPI.*;

public class productSteps {
    @Given("Get Top 100 in region {string} year {string} month {string} day {string}")
    public void getTopInRegion(String regionCode, String y, String m, String d){
        action.givenRegionYMD(regionCode, y, m, d);
    }

    @Then("Response Body Return {string}")
    public void Response_Body_Return(String s) {
        action.responContainsString(s);
    }

    @When("Send Get Top product")
    public void Send_Get_Top_product() {
        action.whenSend(PRODUCT_TOP);
    }

    @Then("Validate Top Product Json Schema")
    public void Validate_Top_Product_Json_Schema() {
        action.jsonSchemaValidate("/product.json");
    }
    
    @Given("Get Checklist feed on a date in region {string} year {string} month {string} day {string}")
    public void getChecklist(String regionCode, String y, String m, String d) {
    	action.givenRegionYMD(regionCode, y, m, d);
    }
    @Then("Send Checklist feed on a date")
    public void sendChecklist() {
    	action.whenSend(PRODUCT_CHECKLIST);
    }
    @And("Response Body Return {} and {}")
    public void responseBodyReturn(String locId, String obsDt) {
    	action.responContainsString(locId);
    	action.responContainsString(obsDt);
    }
    @And("Validate Checklist Json Schema")
    public void validateChecklistJsonSchema() {
    	action.jsonSchemaValidate("/productCheck.json");
    }
    @Given("Get Regional statistics on a date in region {string} year {string} month {string} day {string}")
    public void getRegStatistics(String regionCode, String y, String m, String d) {
    	action.givenRegionYMD(regionCode, y, m, d);
    }
    @When("Send Regional statistics on a date")
    public void sendRegStat() {
    	action.whenSend(PRODUCT_STAT);
    }
    @And("Validate Regional statistics on a date Json Schema")
    public void validateRegStatJson() {
    	action.jsonSchemaValidate("/productStat.json");
    }
}