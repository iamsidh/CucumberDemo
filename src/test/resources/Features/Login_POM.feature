Feature: To check login functionality with user name and password with POM

  Scenario Outline: 
    Given browser is opened using POM
    And user is on login page with POM
    When user enters the <username> and <password> with POM
    And click on Login button with POM
    Then login should be successful with POM

    Examples: 
      | username | password |
      | sidh     | 12345      |
      | nik      | 12345      |
