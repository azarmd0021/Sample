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
