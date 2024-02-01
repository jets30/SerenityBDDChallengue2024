package com.bdd.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ProductosPage extends PageObject {

    WebDriver driver;
    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory ']")
    private List<WebElementFacade> btnAgregar;


    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElementFacade btnCart;
    public void seleccionarCarritoCompra() {

        if(btnCart.isEnabled()){
            btnCart.click();
        }

    }


    public void seleccionarProductos(int cantidad) {


         if (cantidad > btnAgregar.size()) {
             System.out.println("La cantidad de productos solicitada es mayor a la cantidad disponible");
             driver.quit();
            return;
        }

         for (int i=0; i<cantidad; i++){

             Actions act = new Actions(getDriver());
             act.click(btnAgregar.get(i)).perform();
                System.out.println("La cantidad de productos solicitada "+btnAgregar.get(i) );

         }



}

}
