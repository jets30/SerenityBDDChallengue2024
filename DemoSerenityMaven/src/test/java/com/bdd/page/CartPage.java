package com.bdd.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends PageObject {

    WebDriver driver;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElementFacade btnCheckout;

    @FindBy(xpath = "//div[@class='inventory_item_desc']")
    private List<WebElementFacade> textDescription;
    public void verificarCompras() {
        List<String> itemsCapturadosDes = new ArrayList<>();

        for (WebElementFacade itemsDesc : textDescription){

            String textoItemDes = itemsDesc.getText();
            itemsCapturadosDes.add(textoItemDes);
        }

        System.out.println("descripción de productos"+itemsCapturadosDes);

       if(itemsCapturadosDes.isEmpty()){
           System.out.println("El carrito de compras no trae la descripción del producto");
           driver.quit();
       }

        if(btnCheckout.isEnabled()){

            btnCheckout.click();
        }


    }
}
