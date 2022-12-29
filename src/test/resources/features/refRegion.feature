@refRegion
Feature: end point ref/region

  Scenario: Region Info
    Given Get Region Info with region code "ID"
    When Send Region Info
    Then Status Code Should Be 200 OK
    And Response Body Return result "Indonesia"
    And validate Region Info Json Schema

  Scenario: Sub Region List
    Given Get Sub Region List with regionType "subnational2" parentRegionCode "US-NV"
    When Send Sub Region List
    Then Status Code Should Be 200 OK
    And Response Body Return "code" and "name"
    And validate Sub Region List Json Schema
