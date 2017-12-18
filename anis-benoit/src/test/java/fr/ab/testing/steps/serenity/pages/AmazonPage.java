package fr.ab.testing.steps.serenity.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("https://www.amazon.fr")
public class AmazonPage extends PageObject {
	@WhenPageOpens
	public void waitUntilAmazonLogoAppears() {
	$("#nav-logo").waitUntilVisible();
	$("#navFooter > div.navFooterLine.navFooterLogoLine").waitUntilVisible();
	}
	
	@FindBy(id = "#nav-cart > span.nav-cart-icon.nav-sprite")
	private WebElement cartButton;
	
	@FindBy(css = "#GLUXZipUpdateInput")
	private WebElement postalField;
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchInputField;
	
	@FindBy(css = "#nav-link-yourAccount")
	private WebElement connectButton;
	
	@FindBy(id = "nav-your-amazon")
	private WebElement chezVousButton;
	
	@FindBy(css = "#searchDropdownBox > option:nth-child(13)")
	private WebElement categories;
	
	@FindBy(id = "glow-ingress-line1")
	private WebElement adressButton;
	
	@FindBy(css = "#nav-item-signout")
	private WebElement disconnectButton;
	
	@FindBy(css = "#result_0 > div > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small > div:nth-child(1) > a")
	private WebElement firstResult;
	
	public void launchSearch(String keyword) {
		searchInputField.sendKeys(keyword);
		searchInputField.submit();		
	}
	public void openConnexionPage() {
		connectButton.click();
	}
	public void disconnectAccount() {
		disconnectButton.click();
	}
	public void openChezVousPage() {
		chezVousButton.click();
	}
	
	public void openAdressMenu() {
		adressButton.click();
	}
	
	public void enterPostalCode(String postalCode) {
		postalField.sendKeys(postalCode);
		postalField.submit();
	}
	
	public void openFirstResultPage() {
		firstResult.click();
	}
	public void openCartPage() {
		cartButton.click();
	}
	
	public void changeCategory() {
		categories.click();
	}
	

	
}
