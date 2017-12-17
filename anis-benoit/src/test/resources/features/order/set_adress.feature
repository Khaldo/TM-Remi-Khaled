Feature: Some test on adding elements to cart
  In order to place an order on amazon
  As a consumer
  I want to set my adress

  Scenario: change my adress without being connected
    Given I am on Amazon HP
   
Scenario: change my adress while being connected
    Given I am on Amazon HP
    When I click on log in
    When I use login 'crapius.ben.mustapha@gmail.com' and password 'mangaka93' to connect 
    
	
	
    