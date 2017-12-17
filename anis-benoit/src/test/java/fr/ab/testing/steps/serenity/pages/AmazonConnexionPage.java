package fr.ab.testing.steps.serenity.pages;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

public class AmazonConnexionPage extends PageObject {
	@FindBy(id = "ap_password")
	private WebElement Password;
	@FindBy(id = "ap_email")
	private WebElement Login;
	@WhenPageOpens
	public void waitUntilAmazonLogoAppears() {
	$("#signInSubmit").waitUntilVisible();
	}
	public void EnterLogin(String keyword) {
		Login.sendKeys(keyword);	
	}
	public void EnterPassword(String keyword) {
		Password.sendKeys(keyword);
		Password.submit();
	}
	
}
