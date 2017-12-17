package fr.ab.testing.steps.serenity.steps;
import fr.ab.testing.steps.serenity.pages.AmazonProductPage;
import fr.ab.testing.steps.serenity.pages.AmazonCartPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;

public class RemoveFromCartStep {
	AmazonCartPage amazonCartPage;
	
	public void remove_element_in_cart() {
		amazonCartPage.removeElementFromCart();
		}

}
