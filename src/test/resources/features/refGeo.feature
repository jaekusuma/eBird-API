@refGeo
Feature: End Point ref/geo

  Scenario: Adjacent Regions
    Given Get Adjacent Regions "ID"
    When Send Adjacent Regions
    Then Status Code Should Be 200 OK
    And Response Body Return "code" and "name"
    And Validate Adjacent Regions Json Schema
