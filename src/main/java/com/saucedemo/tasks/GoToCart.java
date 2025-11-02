package com.saucedemo.tasks;

import com.saucedemo.ui.CartPage;
import com.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToCart implements Task {

    public static GoToCart view() {
        return new GoToCart();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InventoryPage.CART_LINK),

                WaitUntil.the(CartPage.CHECKOUT_BUTTON, isVisible())
                        .forNoMoreThan(10).seconds(),

                Click.on(CartPage.CHECKOUT_BUTTON)
        );
    }
}
