Feature: Some connexion test on amazon
  In order to acces my account
  As a Amazon user
  I want to be able to connect to my account using my credentials
  
  Scenario: Log in through Amazon Homepage
    Given I am on Amazon HP
    When I click on log in
    When I use login 'crapius.ben.mustapha@gmail.com' and password 'mangaka93' to connect 
	Then I should be connected
	
	Scenario: Log in through Amazon Homepage with wrong credentials
    Given I am on Amazon HP
    When I click on log in
    When I use login 'crapius.bedddn.mustapha@gmail.com' and password 'mangaazdka93' to connect 
	Then I should see 'Impossible de trouver un compte correspondant à cette adresse e-mail'
	
	Scenario: Log in with chez vous on Amazon Homepage
    Given I am on Amazon HP
    When I click on chez vous
    When I use login 'crapius.ben.mustapha@gmail.com' and password 'mangaka93' to connect 
	Then I should be connected
