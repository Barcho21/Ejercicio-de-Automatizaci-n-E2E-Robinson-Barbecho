package com.saucedemo.tasks;

import com.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteCheckout implements Task {
    private final String first;
    private final String last;
    private final String zip;

    private CompleteCheckout(String first, String last, String zip) {
        this.first = first;
        this.last = last;
        this.zip = zip;
    }

    public static CompleteCheckout withData(String first, String last, String zip) {
        return new CompleteCheckout(first, last, zip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(first).into(CheckoutPage.FIRST_NAME),
            Enter.theValue(last).into(CheckoutPage.LAST_NAME),
            Enter.theValue(zip).into(CheckoutPage.POSTAL_CODE),
            Click.on(CheckoutPage.CONTINUE_BUTTON)
        );
    }
}