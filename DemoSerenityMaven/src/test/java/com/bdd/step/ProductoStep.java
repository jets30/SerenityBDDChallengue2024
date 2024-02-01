package com.bdd.step;

import com.bdd.page.ProductosPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductoStep extends ScenarioSteps {

    private ProductosPage productosPage;



    @Step("Agregar productos")
    public void seleccionarCantidadProductos(int cantidad) {

        productosPage.seleccionarProductos(cantidad);




    }
    @Step("Seleccionar carrito de compras")
    public void seleccionarCarroCompras() {

        productosPage.seleccionarCarritoCompra();
    }

}




