package fr.ab.testing.steps.serenity.steps;
import fr.ab.testing.steps.serenity.pages.AmazonProductPage;
import net.serenitybdd.core.Serenity;
import fr.ab.testing.steps.serenity.pages.AmazonCartPage;
import net.serenitybdd.core.annotations.findby.By;

public class AddToCartStep {
	AmazonProductPage amazonProductPage;
	
	public void add_to_cart() {
		amazonProductPage.addElementToCart();
	}

}
