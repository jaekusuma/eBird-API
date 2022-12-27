@DataOBS
Feature: End Point data/obs
  Scenario: Recent observations in a region
    Given Get recent observation in a region with region code "ID"
    When Send get Recent observations in a region
    Then Status Code Should Be 200 OK
    And Response Body Return Body SpeciesCode "lesfri"
    And Validate Json Schema

  Scenario: Recent notable observations in a region
    Given Get recent observation in a region with region code "ID"
    When Send get Recent notable observations in a region
    Then Status Code Should Be 200 OK
    And Response Body Return Body SpeciesCode "dorgos1"
    And Validate Json Schema

  Scenario: Recent observations of a species in a region
    Given Get recent observation in a region with region code "ID" and species Code "yevbul1"
    When Send get Recent observations of a species in a region
    Then Status Code Should Be 200 OK
    And Response Body Return Body SpeciesCode "yevbul1"
    And Validate Json Schema

  Scenario: Recent nearby observations
    Given Get Recent nearby observations in lat "-8.47287" and lng "115.264154"
    When Send get Recent nearby observations
    Then Status Code Should Be 200 OK
    And Response Body Return Body lat "-8.47287" and lng "115.264154"
    And Validate Json Schema

  Scenario: Recent nearby observations of a species
    Given Get Recent nearby observations Soecies "yevbul1" in lat "-8.47287" and lng "115.264154"
    When Send get Recent nearby observations of a species
    Then Status Code Should Be 200 OK
    And Response Body Return Body Soecies "yevbul1" lat "-8.47287" and lng "115.264154"
    And Validate Json Schema

  Scenario: Nearest observations of a species
    Given Get Nearest observations of a species "yevbul1" in lat "-8.47287" and lng "115.264154"
    When Send get Nearest observations of a species
    Then Status Code Should Be 200 OK
    And Response Body Return Body Soecies "yevbul1" lat "-8.47287" and lng "115.264154"
    And Validate Json Schema

  Scenario: Recent nearby notable observations
    Given Get Recent nearby notable observations in lat "-8.47287" and lng "115.264154"
    When Send get Recent nearby notable observations
    Then Status Code Should Be 200 OK
    And Response Body Return Body lat "-8.47287" and lng "115.264154"
    And Validate Json Schema

  Scenario: Recent checklists feed
    Given Get Recent checklists feed with region code "ID"
    When Send get Recent checklists feed
    Then Status Code Should Be 200 OK
    And Response Body Return Body locId "L6476549"
    And Validate Recent checklists feed Json Schema

  Scenario: Historic observations on a date
    Given Get Historic observations of a region code "ID" in year "2021" month "12" day "15"
    When Send get Historic observations on a date
    Then Status Code Should Be 200 OK
    And Response Body Return Body obsDt "2021-12-15"
    And Validate Json Schema