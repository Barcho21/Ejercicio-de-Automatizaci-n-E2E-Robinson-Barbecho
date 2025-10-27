package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final Target FIRST_NAME = Target.the("nombre").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("apellido").located(By.id("last-name"));
    public static final Target POSTAL_CODE = Target.the("código postal").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("continuar").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("finalizar").located(By.id("finish"));
    public static final Target THANK_YOU_HEADER = Target.the("mensaje gracias").located(By.cssSelector("h2.complete-header"));
}