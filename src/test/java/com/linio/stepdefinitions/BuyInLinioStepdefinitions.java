package com.linio.stepdefinitions;

import com.linio.questions.ValidateArticle;
import com.linio.tasks.BuyItem;
import com.linio.tasks.BuyItemCategory;
import com.linio.utils.driver.DriverAppiumAndroid;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class BuyInLinioStepdefinitions {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("as a user access the platform page")
    public void asAUserAccessThePlatformPage() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(DriverAppiumAndroid.suNavegador().on()));

    }

    @When("I select the article {string}  to add to the cart")
    public void iSelectTheArticleToAddToTheCart(String article) {
        theActorInTheSpotlight().attemptsTo(
                BuyItem.conLosDatos(article)
        );
    }


    @When("I select the category and the article {string} to add to the cart")
    public void iSelectTheCategoryAndTheArticleToAddToTheCart(String article) {
        theActorInTheSpotlight().attemptsTo(
                BuyItemCategory.withTheData(article)
        );
    }

    @Then("valid that the article {string} is in the cart")
    public void validThatTheArticleIsInTheCart(String article) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateArticle.selectedArticle(article)));
    }
}
