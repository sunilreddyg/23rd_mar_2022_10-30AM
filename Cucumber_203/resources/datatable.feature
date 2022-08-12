Feature:  Search product
	Scenario: Verifying search with differnet data
	
		When user enter product details
		| iphone13 | available |
    	| iphone15 | norecordsfound |
    	Then verify expected result displayed