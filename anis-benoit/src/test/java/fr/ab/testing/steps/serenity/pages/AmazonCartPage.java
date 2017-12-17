package fr.ab.testing.steps.serenity.pages;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.annotations.findby.By;

public class AmazonCartPage extends AmazonPage {
	@FindBy(css = "#activeCartViewForm > div.sc-list-body.sc-java-remote-feature > div > div.sc-list-item-content > div > div.a-column.a-span8 > div > div > div.a-fixed-left-grid-col.a-col-right > div > span.a-size-small.sc-action-delete > span > input[type=\"submit\"]")
	private WebElement removeFromCartButton;
	
	@WhenPageOpens
	public void waitUntilAmazonLogoAppears() {
	$("#nav-logo").waitUntilVisible();
	}
	public void removeElementFromCart() {
		removeFromCartButton.click();
	}
}
