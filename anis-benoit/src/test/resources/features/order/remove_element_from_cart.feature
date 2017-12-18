Feature: Some test on adding elements to cart
  In order to cancel an order on amazon
  As a consumer
  I want to remove elements from cart

  Scenario: remove element from cart without being connected
    Given I am on Amazon HP
    When I search for 'OnePlus 5'
    When I open first product
    When I add the element to cart
    When I check my cart
    When I remove an element from cart
	Then I should no longer see the product in my cart
    
    Scenario: remove element from cart without being connected
    Given I am on Amazon HP
    When I click on chez vous
    When I use login 'crapius.ben.mustapha@gmail.com' and password 'mangaka93' to connect 
    When I search for 'OnePlus5'
    When I open first product
    When I add the element to cart
    When I check my cart
    When I remove an element from cart
	Then I should no longer see the product in my cart
	
	
	
	
	
    