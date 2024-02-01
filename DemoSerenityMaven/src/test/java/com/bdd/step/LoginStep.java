package com.bdd.step;

import com.bdd.page.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginStep extends ScenarioSteps {

    private LoginPage loginPage;

    @Step("Cargar home")
    public void cargarHome() {

        loginPage.open();
        getDriver().manage().window().maximize();
    }

    @Step("Ingresar credenciales")
    public void ingresarCredenciales(String user, String password) {
        loginPage.ingresarUsuarioPassword(user, password);
    }
    @Step("Realizar click")
    public void realizarClickLogin() {
        loginPage.clickLogin();
    }
    @Step("Validar inicio exitoso")
    public void validarPaginaPrincipal() {
        Assert.assertEquals("Products",loginPage.validarMensaje());
    }



}
