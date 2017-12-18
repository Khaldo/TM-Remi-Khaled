Feature: Some connexion test on amazon
  In order to log out of my account
  As a Amazon user
  I want to be able to disconnect my account
  
  Scenario: Log out through Amazon Homepage
    Given I am on Amazon HP
    When I click on chez vous
    When I use login 'crapius.ben.mustapha@gmail.com' and password 'mangaka93' to connect 
    When I click on log out
	Then I should be disconnected