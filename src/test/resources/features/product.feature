@product
Feature: Product

  Scenario: Product Top 100
    Given Get Top 100 in region "ID" year "2021" month "12" day "15"
    When Send Get Top product
    Then Status Code Should Be 200 OK
    And Response Body Return "profileHandle"
    And Validate Top Product Json Schema

  Scenario: Checklist feed on a date
    Given Get Checklist feed on a date in region "ID" year "2021" month "12" day "15"
    When Send Checklist feed on a date
    Then Status Code Should Be 200 OK
    And Response Body Return "locId" and "obsDt"
    And Validate Checklist Json Schema

  Scenario: Regional statistics on a date
    Given Get Regional statistics on a date in region "ID" year "2021" month "12" day "15"
    When Send Regional statistics on a date
    Then Status Code Should Be 200 OK
    And Response Body Return "numChecklists" and "numContributors"
    And Validate Regional statistics on a date Json Schema

  Scenario: Species List for a Region
    Given Get Species List for a Region "ID"
    When Send Species List for a Region
    Then Status Code Should Be 200 OK
    And Response Body Return "yevbul1"
    And Validate Species List for a Region Json Schema

  Scenario: View Checklist
    Given Get View Checklist by subId "S124454628"
    When Send View Checklist
    Then Status Code Should Be 200 OK
    And Response Body Return subId "S124454628"
    And Validate View Checklist Json Schema
