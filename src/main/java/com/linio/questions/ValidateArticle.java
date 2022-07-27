package com.linio.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.linio.userinterfaces.BuyProductLinio.LABEL_ARTICLE_SEARCH;

public class ValidateArticle implements Question<Boolean> {
    private String message;

    //Se inicializa message con el nombre del producto que deseamos comprar
    public ValidateArticle(String message) {
        this.message = message;
    }

    public static ValidateArticle selectedArticle(String message) {
        return new ValidateArticle(message);
    }

    //Se valida que el nombre del articulo que esta en el carrito es el seleccionado por el usuario
    @Override
    public Boolean answeredBy(Actor actor) {
        String messagePlatform;
        messagePlatform = LABEL_ARTICLE_SEARCH.of(message).resolveFor(actor).getText();
        return message.equalsIgnoreCase(messagePlatform);
    }
}


