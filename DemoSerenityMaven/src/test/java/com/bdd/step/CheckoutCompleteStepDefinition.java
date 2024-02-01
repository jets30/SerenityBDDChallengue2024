package com.bdd.step;

import com.bdd.page.CheckoutCompletePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CheckoutCompleteStepDefinition extends ScenarioSteps {
    private CheckoutCompletePage checkoutCompletePage;
    @Step("Validar Mensaje Exitoso")
    public void validarCompraExitosa() {

        Assert.assertEquals("THANK YOU FOR YOUR ORDER",checkoutCompletePage.validarMensaje());




    }
}
