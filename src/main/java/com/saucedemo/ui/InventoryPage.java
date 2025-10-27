package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {
    public static final Target ADD_BACKPACK = Target.the("agregar mochila").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target ADD_BIKE_LIGHT = Target.the("agregar luz de bicicleta").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target CART_BADGE = Target.the("badge carrito").located(By.className("shopping_cart_badge"));
    public static final Target CART_LINK = Target.the("ir al carrito").located(By.className("shopping_cart_link"));
}