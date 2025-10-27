package com.saucedemo.tasks;

import com.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class FinishPurchase implements Task {
    public static FinishPurchase now() { return new FinishPurchase(); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(CheckoutPage.FINISH_BUTTON)
        );
    }
}