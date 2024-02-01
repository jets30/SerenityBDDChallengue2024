package com.bdd.step;

import com.bdd.page.InformationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class InformationStep extends ScenarioSteps {

    private InformationPage informationPage;

    @Step("Completar Formulario")
    public void completarFormularioDeCompra(String name, String lastName, String postalCode) {
        informationPage.completarRegistroCompra(name,lastName,postalCode);


    }

    @Step("Click en botón continuar")
    public void clickContinuarCompra() {

        informationPage.clickBotonCompra();

    }
}
