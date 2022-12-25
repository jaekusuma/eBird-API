Feature: End Point data/obs
  Scenario: Recent observations in a region
    Given Get recent observation in a region with region code "ID"
    When Send get Recent observations in a region
    Then Status Code Should Be 200 OK
    And Response Body Return Body SpeciesCode "lesfri"
    And Validate Json Schema