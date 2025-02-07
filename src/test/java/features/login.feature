Feature: Login Validation using all user roles
  I want to use this feature
  
  Background: 
  Given Launch the browser
  When User Enters the staging URL
  Then Click Enter to Launch the Website
  And User Lands on the login page
  
  
   
	@Smoke 
  Scenario: Login Scenario
    Given User is on login page
    When User enters the username and password
    Then Home page is displayed
  @Smoke  
 	Scenario: Login Scenario
    Given User is on login page
    When User enters the username "admin" and password "magic123"
    Then Home page is displayed
  
  @Regression  
  Scenario: Login Scenario
    Given User is on login page
    When User enters the details
    |sup@magicsw.com|
    |magic123|
    
    Then Home page is displayed	  
  

#	Scenario Outline: Title of your scenario outline
#		Given User is on login page
#    When User enters the username "<username>" and password "<password>"
#    Then Home page is displayed

#   Examples: 
#      | username  | password  |
#      | abhirup		| magic123  |
#      | ivaan			|	magic234	|
#      |	arunima		|	magic890	|
  
  @Test @Sanity    
  Scenario Outline: Title of your scenario outline
		Given User is on login page
    When User entered the username <username> and password <password>
    Then Home page is displayed

   Examples: 
      | username  		| password  |
      | abhirup				| magic123  |
      | ivaan					|	12345			|
      |	arunima@123		|	magic$@123	|