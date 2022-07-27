package com.linio.tasks;

import com.linio.interactions.SelectItemSearchInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.linio.userinterfaces.BuyProductLinio.*;

public class BuyItem implements Task {
    private String articleName;

    //Se inicializa articleName con el nombre del articulo seleccionado por el usuario
    public BuyItem(String articleName) {
        this.articleName = articleName;

    }


    public static Performable conLosDatos(String articleName) {
        return Tasks.instrumented(BuyItem.class, articleName);
    }

    //Selecciona el producto y se anexa al carrito de compras
    @Override
    public <T extends Actor> void performAs(T actor) {
        // appium button search keyboard (SelectItemSearchInteraction)
        actor.attemptsTo(
                Click.on(IMAGE_SEARCH_ARTICLE),
                Enter.theValue(articleName).into(INPUT_ARTICLE),
                SelectItemSearchInteraction.ToFindProduct(),
                Click.on(LABEL_ARTICLE_SELECTED),
                Click.on(IMAGE_ADD_TO_CART),
                Click.on(IMAGE_CART)
        );
    }
}
