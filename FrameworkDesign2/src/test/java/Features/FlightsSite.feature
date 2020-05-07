Feature: Flight online service 


Scenario Outline: Register the user and basic user info 
	Given user launch url "http://newtours.demoaut.com/" 
	When user is on home page 
	Then verify the home logo 
	Then user click on Register link 
	Then user enters contact information "<FN>","<LN>","<PH>","<EMAIL>" 
	Then user enter address details "<Address>","<city>","<country>" 
	Then user enters user information "<UN>","<PSWD>","<CONPSWD>" 
	Then user click on Submit button 
	And verify the successful registration message 
	And close the browser 
	
	Examples: 
		|FN| LN | PH | EMAIL |Address|city|country|UN|PSWD|CONPSWD|
		|ABHI|THAKUR|999999999|abcd@gmail.com|KP|PUNE|INDIA|absk|pswd@123|pswd@123|
		|Pragya|Ratan|999999999|prgy@gmail.com|KP|PUNE|INDIA|absk|pswd@123|pswd@123|
		|Pragya|Ratan|999999999|prgy@gmail.com|KP|PUNE|||||
@Regression 
Scenario Outline: Login to flight site 
	Given user goto url "http://newtours.demoaut.com/" 
	When user is on home page 
	Then user enters "<username>" and "<password>" 
	And user click on signin button 
	And close all 
	
	Examples: 
	
		|username|password|
		|absk|pswd@123|
		
@Smoke 
	Scenario: smoke test 
			Given smoke given 
			When smoke when 
			Then smoke testing