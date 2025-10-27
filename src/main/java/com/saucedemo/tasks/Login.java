package com.saucedemo.tasks;

import com.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

public class Login implements Task {
    private final String user;
    private final String pass;

    private Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static Login withStandardUser() {
        return new Login("standard_user", "secret_sauce");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(LoginPage.USERNAME),
                Enter.theValue(pass).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}