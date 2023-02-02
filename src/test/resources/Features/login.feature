#Auther : Siddhesh M

@SmokeScenario
Feature: feature to test login functionality

  @SmokeTest
  Scenario: Check login successfull with login credentials
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to home page

  
