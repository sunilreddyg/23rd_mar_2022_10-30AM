Feature: Verifying Registration
	Scenario: Valid Registration
		Given Open browser "chrome"
		And type url as "http:/facebook.com"
		When user type firstname as "Sachin"
		And type Surname as "Tendulkar"
		And type email as "Sachin@gmail.com"
		And age selected 21
		And click on create account button
		Then verify status message displayed as "Account Created successfull"
		
	