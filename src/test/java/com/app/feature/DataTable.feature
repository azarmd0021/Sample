Feature: LoginPage Validation1

  @Smoke
  Scenario: Validate with valid username and password
    Given Launch the URL
    When Enter the username "Muthulakshmi07"
    And Enter the password "Test@123"
    And Click the login button
    Then Validate the HomePage

  Scenario: Validate with invalid username and password
    Given Launch the URL
    When Enter the username "Aiite1"
    And Enter the password "1234567"
    And Click the login button
    Then Validate the HomePage

  #data Table Concept
  @asList
  Scenario: Validate with valid username and password
    When Enter the username as passing datatbale
      | test1 |
      | test2 |
      | test3 |
      | test4 |

  #And Enter the password "Test@123"
  #And Click the login button
  #Then Validate the HomePage
  #data Table Concept
  @asLists
  Scenario: Validate with valid username and password
    When Enter the username as passing datatbale
      | test1 | A |        
      | test2 | B |
      | test3 | C |
      | test4 | D |
      
      @asMap
  Scenario: Validate with valid username and password
    When Enter the username as passing datatbale
      | Email | user1 |        
      | Name | Yuvaraj |
      | test3 | user3 |
      | test4 | user4 |
      
      @asMaps
  Scenario: Validate with valid username and password
    When Enter the username as passing datatbale
      | data1 | data2 |        
      | test1 | user1 |
      | test2 | user2 |
      | test3 | user3 |
