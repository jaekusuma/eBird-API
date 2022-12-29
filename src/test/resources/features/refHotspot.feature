@refHotspot
Feature: End Point ref/hotspot

  Scenario: Hotspots in a region
    Given Get Hotspots in a region "ID"
    When Send Get Hotspots in a region
    Then Status Code Should Be 200 OK
    And Response Body Return "ID"

  Scenario: Nearby hotspots
    Given Get Nearby hotspots in lat "-8.5242106" and lng "115.2245772"
    When Send Nearby hotspots
    Then Status Code Should Be 200 OK
    And Response Body Return lat "-8.5242106" and lng "115.2245772"

  Scenario: Hotspot Info
    Given Get Hotspot Info with locId "L1285861"
    When Send Hotspot Info
    Then Status Code Should Be 200 OK
    And Response Body Return Body locID "L1285861"
    And Validate Hotspot Info Json Schema
