package com.linio.interactions;

import com.google.common.collect.ImmutableMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

import static com.linio.utils.driver.DriverAppiumAndroid.driver;

public class SelectItemSearchInteraction implements Interaction {

    public static Performable ToFindProduct() {
        return Tasks.instrumented(SelectItemSearchInteraction.class);
    }

//Se da la accion sobre la opcion de busqueda del teclado del movil
    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }
}
