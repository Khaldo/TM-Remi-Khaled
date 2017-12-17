package fr.ab.testing.steps.serenity.steps;

import fr.ab.testing.steps.serenity.pages.AmazonConnexionPage;
import fr.ab.testing.steps.serenity.pages.AmazonPage;
import jnr.ffi.Struct.id_t;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;

public class ConnectStep {
	AmazonPage amazonPage;
	AmazonConnexionPage amazonConnexionPage;
	
	public void open_amazon_page() {		
		amazonPage.open();
	}

	public void open_connexion_page() {
		amazonPage.openConnexionPage();
	}
	
	public void disconnect_account() {
		amazonPage.disconnectAccount();
	}
	public void am_I_logged_out() {
		amazonPage.containsText("Bonjour. Identifiez-vous");
	}
	public void am_I_logged_in() {
		//seul text facilement identifiable pour savoir si l'on est connecté
		amazonPage.containsText("Solde Chèques-cadeaux et Recharge");
	}

	public void click_on_chez_vous() {
		amazonPage.openChezVousPage();
	}
	
	public void enter_login(String login) {
		amazonConnexionPage.EnterLogin(login);;
	}
	
	public void enter_password(String password) {
		amazonConnexionPage.EnterPassword(password);
	}
	
	

}
