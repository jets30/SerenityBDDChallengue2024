package com.bdd.stepDefinition;

import com.bdd.step.LoginStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    private LoginStep loginStep;


   @Given("^inicio de sesion con credenciales validas$")
   public void inicioDeSesionConCredencialesValidas() {
       loginStep.cargarHome();

   }
    @When("^ingresa \"([^\"]*)\" y \"([^\"]*)\"$")
    public void ingresaY(String user, String password) throws Throwable {
        loginStep.ingresarCredenciales(user, password);

    }
    @And("^realizo click en el boton login$")
    public void realizoClickEnElBotonLogin() {

        loginStep.realizarClickLogin();
    }
    @Then("^debe ver la pagina principal$")
    public void debeVerLaPaginaPrincipal() {

        loginStep.validarPaginaPrincipal();
    }



}
