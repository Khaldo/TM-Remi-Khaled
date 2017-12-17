package fr.ab.testing.steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.ab.testing.steps.serenity.steps.ConnectStep;
import net.thucydides.core.annotations.Steps;

public class ConnectToAmazon {	
	    @Steps	    
	    ConnectStep connectStep;

	    @Given("I am on Amazon HP")
	    public void openAmazon() {
	    	connectStep.open_amazon_page();
	    }
	    
	    @When("^I click on chez vous$")
	    public void i_click_on_chez_vous_button(){
	        connectStep.click_on_chez_vous();
	    }

	    @When("I click on log in")
	    public void openConnexion() {
	    	connectStep.open_connexion_page();
	    }
	    
	    @When("I click on log out")
	    public void closeConnexion() {
	    	connectStep.disconnect_account();
	    }
	    
	    @When("I use login '(.*)' and password '(.*)' to connect")
	    public void loginToAmazon(String login, String password) {
	    	connectStep.enter_login(login);
	    	connectStep.enter_password(password);
	    }

	    @Then("I should be disconnected")
	    public void checkIfLoggedOut() {
	    	connectStep.am_I_logged_out();
	    }
	    @Then("I should be connected")
	    public void checkIfLoggedIn() {
	    	connectStep.am_I_logged_out();
	    }
	    
	    
	}
