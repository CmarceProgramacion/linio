package com.linio.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "com.linio.stepdefinitions",
        features = "src/test/resources/features/buy_in_linio.feature",
        tags = "@Case2",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class BuyItems {
}
