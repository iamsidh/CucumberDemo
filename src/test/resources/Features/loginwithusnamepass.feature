Feature: To check login functionality with user name and password

  Scenario Outline: 
    Given browser is opened
    And user is on login page1
    When user enter <username> and <password>
    And click on Login button
    Then login should be successful

    Examples: 
      | username | password |
      | sidh     | 12345      |
      | nik      | 12345      |
