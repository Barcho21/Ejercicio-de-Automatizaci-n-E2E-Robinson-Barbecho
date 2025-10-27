package com.saucedemo.tasks;

import com.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddTwoProducts implements Task {
    public static AddTwoProducts toCart() { return new AddTwoProducts(); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(InventoryPage.ADD_BACKPACK, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(InventoryPage.ADD_BACKPACK),
            Click.on(InventoryPage.ADD_BIKE_LIGHT)
        );
    }
}