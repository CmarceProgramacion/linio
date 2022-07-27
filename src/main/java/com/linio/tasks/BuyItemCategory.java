package com.linio.tasks;

import com.linio.interactions.SearchArticleWithScrollInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.linio.userinterfaces.BuyProductLinio.*;

public class BuyItemCategory implements Task {
    private String article;
    //Se inicializa article con el nombre del producto seleccionado por el usuario
    public BuyItemCategory(String article) {
        this.article = article;
    }
    public static Performable withTheData(String article) {
        return Tasks.instrumented(BuyItemCategory.class, article);
    }

    //Se realiza la seleccion de la categoria del producto, posteriormente se selecciona el articulo a comprar y se adiciona al carrito de compras
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IMAGE_CATEGORIES),
                Click.on(ARTICLE_TYPE_IMAGE),
                Click.on(BUTTON_ORDER),
                Click.on(MENU_ORDER),
                SearchArticleWithScrollInteraction.searchArticle(article),
                Click.on(LABEL_ARTICLE_SEARCH.of(article)),
                Click.on(IMAGE_ADD_TO_CART),
                Click.on(IMAGE_CART)
        );
    }
}
