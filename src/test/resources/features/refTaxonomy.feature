@taxonomy
Feature: end point ref/taxonomy

  Scenario: eBird Taxonomy
    Given Get eBird Taxonomy with valid token
    When Send eBird Taxonomy
    Then Status Code Should Be 200 OK
    And Response Body Return "SCIENTIFIC_NAME,COMMON_NAME,SPECIES_CODE,CATEGORY,TAXON_ORDER,COM_NAME_CODES,SCI_NAME_CODES,BANDING_CODES,ORDER,FAMILY_COM_NAME,FAMILY_SCI_NAME,REPORT_AS,EXTINCT,EXTINCT_YEAR,FAMILY_CODE"

  Scenario: Taxonomic Forms
    Given Get Taxonomic Forms with species code "yevbul1"
    When Send Taxonomic Forms
    Then Status Code Should Be 200 OK
    And Response Body Return "yevbul1"
    And validate Taxonomic Forms Json Schema

  Scenario: Taxa Locale Codes
    Given Get Taxa Locale Codes
    When Send TTaxa Locale Codes
    Then Status Code Should Be 200 OK
    And Response Body Return "code" "name" and "lastUpdate"
    And validate Taxa Locale Codes Forms Json Schema
