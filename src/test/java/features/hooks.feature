Feature: Login Validation using all user roles
  I want to use this feature
  
  Background: 
  Given Launch the browser
  When User Enters the staging URL
  Then Click Enter to Launch the Website
  And User Lands on the login page
  
	@Netbanking 
  Scenario: Netbanking Scenario
    Given User is on login page
    When User enters the username and password
    Then Home page is displayed
    
  @Mortgage  
 	Scenario: Login Scenario
    Given User is on login page
    When User enters the username "admin" and password "magic123"
    Then Home page is displayed
  