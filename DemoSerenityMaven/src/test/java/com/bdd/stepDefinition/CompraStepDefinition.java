package com.bdd.stepDefinition;

import com.bdd.step.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class CompraStepDefinition {

    @Steps
    private LoginStep loginStep;
    @Steps
    private ProductoStep productoStep;
    @Steps
    private CartStep cartStep;
    @Steps
    private InformationStep informationStep;
    @Steps
    private CheckoutOverviewStepDefinition checkoutOverviewStepDefinition;
    @Steps
    private CheckoutCompleteStepDefinition checkoutCompleteStepDefinition;

    @Given("^el usuario navega en la pagina de inicio de sesion$")
    public void elUsuarioNavegaEnLaPaginaDeInicioDeSesion() {

        loginStep.cargarHome();
    }

    @Given("^usuario ingresa \"([^\"]*)\" y \"([^\"]*)\"$")
    public void usuarioIngresaY(String user, String password) throws Throwable {

        loginStep.ingresarCredenciales(user, password);
        loginStep.realizarClickLogin();
        loginStep.validarPaginaPrincipal();
    }

    @When("^el usuario agrega una (\\d+) de productos$")
    public void elUsuarioAgregaUnaCantidadDeProductos(int cantidad) {

        productoStep.seleccionarCantidadProductos(cantidad);
    }

    @And("^se dirige al carro de compras$")
    public void seDirigeAlCarroDeCompras() {

        productoStep.seleccionarCarroCompras();
        cartStep.verificarCompra();
    }

    @And("^completa el formulario de compras ingresando \"([^\"]*)\",\"([^\"]*)\" y \"([^\"]*)\",$")
    public void completaElFormularioDeComprasIngresandoY(String name, String lastName, String PostalCode) throws Throwable {

        informationStep.completarFormularioDeCompra(name,lastName,PostalCode);
        informationStep.clickContinuarCompra();
    }

    @When("^le da click en finalizar$")
    public void leDaClickEnFinalizar() {

        checkoutOverviewStepDefinition.clickFinalizar();

    }

    @Then("^finaliza la compra exitosamente$")
    public void finalizaLaCompraExitosamente() {

        checkoutCompleteStepDefinition.validarCompraExitosa();
    }



}
