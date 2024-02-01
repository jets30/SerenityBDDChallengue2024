package com.bdd.step;

import com.bdd.page.CartPage;
import net.thucydides.core.annotations.Step;


public class CartStep extends CartPage {

    private CartPage cartPage;
    @Step("Seleccionar Checkout")
    public void verificarCompra() {

    cartPage.verificarCompras();

    }
}
