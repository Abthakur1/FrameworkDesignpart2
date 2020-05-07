Feature: gile travel website BDD testing 

Background: 
	Given user go to url "http://travel.agileway.net/login" 
	And user enters username "agileway" 
	And user enters password "testwise" 
	And user check the remember checkbox 
	And user click on Sign in button 
	
@LoginLogouttest	
Scenario: Login and Logoff test 
	Given user is on login page 
	And user enters username "agileway" 
	And user enters password "testwise" 
	And user check the remember checkbox 
	When user click on Sign in button 
	Then successful login with Signed in message displyed 
	
@Onewaytest	
Scenario Outline: One way flight 
	Given user selects Trip Type 
	When user selects from "<origin>" 
	And user selects to "<destintion>" 
	And user selects day "<day>" 
	And user select month "<month>" 
	And user click on continue button
	
	Examples: 
		|origin|destintion|day|month|
		|New York|Sydney|05|December 2016|
		|Sydney|New York|05|December 2016|
		