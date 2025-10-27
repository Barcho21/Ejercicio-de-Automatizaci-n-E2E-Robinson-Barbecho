package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME = Target.the("campo usuario").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("campo contraseña").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("botón login").located(By.id("login-button"));
}