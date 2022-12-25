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