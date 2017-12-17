package fr.ab.testing.steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.steps.AmazonStep;
import net.thucydides.core.annotations.Steps;


public class SearchOnAmazonKeyword {
	
	    @Steps
	    AmazonStep amazonStep;

	    @Given("I have been connected on Amazon")
	    public void buyerWantsToBuy() {
	    	amazonStep.open_amazon_home();
	    }

	    @When("I search for '(.*)'")
	    public void searchByKeyword(String keyword) {
	    	amazonStep.searches_for_items(keyword);
	    }
	    
	    @When("I select categorie")
	    public void selectCategorie() {
	    	amazonStep.change_category();	    	
	    }
	    
	    @When("I open first product")
	    public void openFirstProduct() {
	    	amazonStep.open_first_result();	    	
	    }

	    @Then("I should see items containing '(.*)'")
	    public void shouldSeeItemsContaining(String keyword) {
	    	amazonStep.should_see_items_related_to(keyword);
	    }
	    
	    @Then("I should see '(.*)'")
	    public void noResult(String keyword) {
	    	amazonStep.should_have_no_result(keyword);
	    }
	
}
