package com.bdd.step;

import com.bdd.page.CheckoutOverviewPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CheckoutOverviewStepDefinition extends ScenarioSteps {


    private CheckoutOverviewPage checkoutOverviewPage;
    @Step("Finalizar Compra")
    public void clickFinalizar() {
        Assert.assertEquals("Checkout: Overview", checkoutOverviewPage.validacionOverview());
        checkoutOverviewPage.clickFinalizarCompra();
    }

}
