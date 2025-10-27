package com.saucedemo.questions;

import com.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PurchaseConfirmation implements Question<String> {
    public static PurchaseConfirmation message() { return new PurchaseConfirmation(); }

    @Override
    public String answeredBy(Actor actor) {
        return CheckoutPage.THANK_YOU_HEADER.resolveFor(actor).getText();
    }
}