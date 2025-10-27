package com.saucedemo;

import com.saucedemo.questions.PurchaseConfirmation;
import com.saucedemo.tasks.*;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CompraSteps {

    @Managed(driver = "chrome")
    WebDriver hisBrowser;

    private final Actor robinson = Actor.named("Robinson");

    @Dado("que el usuario accede a la página de SauceDemo")
    public void que_el_usuario_accede_a_la_pagina_de_sauce_demo() {
        robinson.can(BrowseTheWeb.with(hisBrowser));
        robinson.attemptsTo(OpenThe.saucedemo());
    }

    @Cuando("inicia sesión con credenciales válidas")
    public void inicia_sesion_con_credenciales_validas() {
        robinson.attemptsTo(Login.withStandardUser());
    }

    @Cuando("agrega dos productos al carrito")
    public void agrega_dos_productos_al_carrito() {
        robinson.attemptsTo(AddTwoProducts.toCart());
    }

    @Cuando("visualiza el carrito y continúa con la compra")
    public void visualiza_el_carrito_y_continua_con_la_compra() {
        robinson.attemptsTo(GoToCart.view());
    }

    @Cuando("completa el formulario de datos con {string} {string} {string}")
    public void completa_el_formulario_de_datos_con(String nombre, String apellido, String cp) {
        robinson.attemptsTo(CompleteCheckout.withData(nombre, apellido, cp));
    }

    @Cuando("finaliza la compra")
    public void finaliza_la_compra() {
        robinson.attemptsTo(FinishPurchase.now());
    }

    @Entonces("debe ver el mensaje {string}")
    public void debe_ver_el_mensaje(String esperado) {
        String mensaje = PurchaseConfirmation.message().answeredBy(robinson);
        assertThat("El mensaje final no coincide", mensaje, equalTo(esperado));
    }
}
