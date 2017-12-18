package fr.ab.testing.steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.steps.ConnectStep;
import fr.ab.testing.steps.serenity.steps.AddToCartStep;
import fr.ab.testing.steps.serenity.steps.AmazonStep;
import fr.ab.testing.steps.serenity.steps.RemoveFromCartStep;
import javafx.geometry.Pos;
import net.thucydides.core.annotations.Steps;

public class OrderManagementAmazon {	
	    @Steps	    
	    ConnectStep connectStep;
	    AmazonStep amazonStep;
	    AddToCartStep addToCartStep;
	    RemoveFromCartStep removeFromCartStep;
	    
	    @When("I add the element to cart")
	    public void i_click_on_chez_vous_button(){
	    	addToCartStep.add_to_cart();
	    }

	    @When("I use the adress option")
	    public void i_click_on_adress_button(){
	    	amazonStep.show_adress();
	    }
	    
	    @When("I enter the postal code '(.*)'")
	    public void i_enter_postal_code(String postalCode){
	    	amazonStep.change_postal_code(postalCode);
	    }
	    
	    @When("I check my cart")
	    public void openConnexion() {
	    	amazonStep.open_cart();
	    }
	    
	    @When("I remove an element from cart")
	    public void closeConnexion() {
	    	removeFromCartStep.remove_element_in_cart();
	    }	    	  

	    @Then("I should see the product in my cart")
	    public void checkProductIsInCart() {
	    	
	    }
	    @Then("I should no longer see the product in my cart")
	    public void checkProductIsNotInCart() {	    
	    }
	    
	    
	}
