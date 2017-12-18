Feature: Some test on adding elements to cart
  In order to place an order on amazon
  As a consumer
  I want to add elements to cart

  Scenario: add element to cart without being connected
    Given I am on Amazon HP
    When I search for 'OnePlus 5'
    When I add the element to cart
    When I check my cart
	Then I should see the product in my cart
    
  Scenario: add element to cart while being connected
    Given I am on Amazon HP
    When I click on chez vous
    When I use login 'crapius.ben.mustapha@gmail.com' and password 'mangaka93' to connect 
    When I search for 'OnePlus 5'
    When I open first product
    When I add the element to cart
    When I check my cart
	Then I should see the product in my cart
	
	Scenario: when i log in and out and back again, i should find my cart unchanged
    Given I am on Amazon HP
    When I click on chez vous
    When I use login 'crapius.ben.mustapha@gmail.com' and password 'mangaka93' to connect 
    When I search for 'OnePlus 5'
    When I add the element to cart
    When I open first product
    When I click on log out
    When I click on chez vous
    When I use login 'crapius.ben.mustapha@gmail.com' and password 'mangaka93' to connect 
    When I check my cart
	Then I should see the product in my cart
	
	
	
	
    