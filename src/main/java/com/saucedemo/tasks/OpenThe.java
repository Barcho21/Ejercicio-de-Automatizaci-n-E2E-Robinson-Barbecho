package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {
    private final String url;

    private OpenThe(String url) { this.url = url; }

    public static OpenThe saucedemo() {
        return new OpenThe("https://www.saucedemo.com/");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}