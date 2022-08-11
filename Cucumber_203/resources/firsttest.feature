Feature:  Simple login test

	Scenario: Verifying login with valid data
	Given site url facebook
	When Enter valid username
	And Enter valid password 
	And click on login button
	Then Login will be successful