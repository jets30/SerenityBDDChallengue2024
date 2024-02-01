package com.bdd.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@type='text']")
    private WebElementFacade txtUser;
    @FindBy(xpath = "//input[@type='password']")
    private WebElementFacade txtPassword;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElementFacade btnLogin;
    @FindBy(xpath = "//span[@class='title']")
    private WebElementFacade textTitle;

    public void ingresarUsuarioPassword(String user, String password) {

        txtUser.sendKeys(user);
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public String validarMensaje() {

        return   textTitle.getText();


    }

}
