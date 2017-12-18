Feature: Some test on adding elements to cart
  In order to place an order on amazon
  As a consumer
  I want to set my adress

  Scenario: change my adress without being connected
    Given I am on Amazon HP
    When I use the adress option
    When I enter the postal code '59800'
    Then I should see ''
   
Scenario: change my adress while being connected
    Given I am on Amazon HP
    When I click on chez vous
    When I use login 'crapius.ben.mustapha@gmail.com' and password 'mangaka93' to connect 
    When I use the adress option
	Then I should see ''
	
    