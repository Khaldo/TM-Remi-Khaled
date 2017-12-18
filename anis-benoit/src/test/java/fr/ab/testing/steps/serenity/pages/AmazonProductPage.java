package fr.ab.testing.steps.serenity.pages;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.annotations.findby.By;

@DefaultUrl("http://www.amazon.fr")
public class AmazonProductPage extends AmazonPage {
	@FindBy(id = "add-to-cart-button")
	private WebElement addToCartButton;
	@WhenPageOpens
	public void waitUntilAmazonLogoAppears() {
	$("#nav-logo").waitUntilVisible();
	}
	public void addElementToCart() {
		addToCartButton.click();
	}
}
