package fr.ab.testing;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/order/add_element_to_cart.feature","src/test/resources/features/order/remove_element_from_cart.feature","src/test/resources/features/order/set_adress.feature"})
public class OrderAmazon {}