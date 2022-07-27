package com.linio.interactions;


import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;


import static com.linio.utils.driver.DriverAppiumAndroid.driver;

public class SearchArticleWithScrollInteraction implements Interaction {
    private String article;
    //Se inicializa article con el nombre del producto a comprar
    public SearchArticleWithScrollInteraction(String article) {
        this.article = article;
    }

    public static Performable searchArticle(String articleXpath) {
        return Tasks.instrumented(SearchArticleWithScrollInteraction.class, articleXpath);
    }

    //Se manipula el scroll para ubicar el nombre del producto que deseamos comprar
    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"" + article + "\"));"));
    }

}


