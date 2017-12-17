Feature: Some test around the search bar on amazon
  In order to make a research on amazon
  As a consumer
  I want to get the result expected

  Scenario: Search Amazon
    Given I am on Amazon HP
    When I search for 'OnePlus 5'
	Then I should see items containing 'OnePlus 5'
    
  Scenario: Search in categories Amazon
    Given I am on Amazon HP
    When I select categorie
    When I search for 'Nioh'
	Then I should see 'avons trouvé aucun résultat'
	
	
	
	
    