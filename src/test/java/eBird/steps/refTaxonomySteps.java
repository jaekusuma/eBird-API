package eBird.steps;

import eBird.action;
import static eBird.eBirdAPI.*;
import io.cucumber.java.en.*;

public class refTaxonomySteps {
	@Given("Get eBird Taxonomy with valid token")
	public void getEbirdTaxonomyWithValidToken() {
		action.givenToken();
	}

	@When("Send eBird Taxonomy")
	public void sendEBirdTaxonomy() {
		action.whenSend(TAXONOMY_EBIRD);
	}

	@Given("Get Taxonomic Forms with species code {string}")
	public void getTaxonomicFormsWithSpeciesCode(String arg1) {
		action.givenSpeciesCode(arg1);
	}

	@When("Send Taxonomic Forms")
	public void sendTaxonomicForms() {
		action.whenSend(TAXONOMY_FORM);
	}

	@And("validate Taxonomic Forms Json Schema")
	public void validateTaxonomicFormsJsonSchema() {
		action.jsonSchemaValidate("/refTaxForm.json");
	}

	@Given("Get Taxa Locale Codes")
	public void getTaxaLocaleCodes() {
		action.givenToken();
	}

	@When("Send TTaxa Locale Codes")
	public void sendTTaxaLocaleCodes() {
		action.whenSend(TAXONOMY_TAXA);
	}

	@And("Response Body Return {string} {string} and {string}")
	public void responseBodyReturnAnd(String arg1, String arg2, String arg3) {
		action.responContainsString(arg1);
		action.responContainsString(arg2);
		action.responContainsString(arg3);
	}

	@And("validate Taxa Locale Codes Forms Json Schema")
	public void validateTaxaLocaleCodesFormsJsonSchema() {
		action.jsonSchemaValidate("/refTaxTaxa.json");
	}

	@Given("Get Taxonomy Versions")
	public void getTaxonomyVersions() {
		action.givenToken();
	}

	@When("Send Taxonomy Versions")
	public void sendTaxonomyVersions() {
		action.whenSend(TAXONOMY_VERSION);
	}

	@And("Response Body Return {string} {string}")
	public void responseBodyReturn(String arg1, String arg2) {
		action.responContainsString(arg1);
		action.responContainsString(arg2);
	}

	@And("validate Taxonomy Versions Json Schema")
	public void validateTaxonomyVersionsJsonSchema() {
		action.jsonSchemaValidate("/refTaxVersion.json");
	}

	@Given("Get Taxonomic Groups with species group {string}")
	public void getTaxonomicGroupsWithSpeciesGroup(String arg1) {
		action.givenTaxGroup(arg1);
	}

	@When("Send Taxonomic Groups")
	public void sendTaxonomicGroups() {
		action.whenSend(TAXONOMY_GROUP);
	}

	@And("validate Taxonomic Groups Json Schema")
	public void validateTaxonomicGroupsJsonSchema() {
		action.jsonSchemaValidate("/refTaxGroup.json");
	}
}
