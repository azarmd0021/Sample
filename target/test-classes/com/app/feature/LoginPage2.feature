@Tag_Scenario_Outline
Feature: LoginPage Validation2
Background:
 Given Launch the URL

  Scenario: Validate with valid username and password
    When Enter the username "Aiite"
    And Enter the password "1234567"
    And Click the login button
    Then Validate the HomePage

  Scenario: Validate with invalid username and password
    When Enter the username "Aiite2"
    And Enter the password "1234567"
    And Click the login button
    Then Validate the HomePage

	
  Scenario Outline: Validate the username and password
    #When Enter the username "Aiite2"
    #And Enter the password "1234567"
    #And Click the login button
    #Then Validate the HomePage
    When Enter the username "<username>"
    And Enter the password "<password>"

    Examples: 
      | username | password      |
      | Aiite1   | wert234567    |
      | Aiite2   | wertyuio45678 |
      | Aiite3   | ertv567ghj    |
