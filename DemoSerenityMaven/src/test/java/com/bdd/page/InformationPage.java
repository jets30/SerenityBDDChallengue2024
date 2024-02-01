package com.bdd.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InformationPage extends PageObject {


    @FindBy(xpath = "//input[@id='first-name']")
    private WebElementFacade txtFirstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElementFacade txtLastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElementFacade txtPostalCode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElementFacade btnContinue;



    public void completarRegistroCompra(String name, String lastName, String postalCode) {

        txtFirstName.sendKeys(name);
        txtLastName.sendKeys(lastName);
        txtPostalCode.sendKeys(postalCode);
    }

    public void clickBotonCompra() {

        if (btnContinue.isEnabled()){
            btnContinue.click();
        }

    }
}
