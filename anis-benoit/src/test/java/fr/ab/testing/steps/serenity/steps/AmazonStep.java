package fr.ab.testing.steps.serenity.steps;

import fr.ab.testing.steps.serenity.pages.AmazonPage;
import jnr.ffi.Struct.id_t;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;

public class AmazonStep {
	AmazonPage amazonPage;
	
	public void open_amazon_home() {		
		amazonPage.open();
	}

	public void searches_for_items(String keyword) {
		amazonPage.launchSearch(keyword);
	}

	public void should_see_items_related_to(String keyword) {
		amazonPage.shouldContainAllText(keyword);
	}
	
	public void change_category() {
		amazonPage.changeCategory();
	}
	
	public void open_first_result() {
		amazonPage.openFirstResultPage();
	}
	
	public void open_cart() {
		amazonPage.openCartPage();
	}
	
	public void should_have_no_result(String keyword){
		amazonPage.shouldContainText(keyword);
	}

}
