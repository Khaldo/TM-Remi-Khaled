package fr.ab.testing;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/connect/log_in_amazon.feature","src/test/resources/features/connect/log_out_amazon.feature"})
public class ConnectAmazon {}