package com.bdd.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends PageObject {
    WebDriver driver;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElementFacade btnFinalizar;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElementFacade lblTotalPrice;
    @FindBy(xpath = "//span[@class='title']")
    private WebElementFacade title;
    public void clickFinalizarCompra() {

        String  precio= lblTotalPrice.getText();

        if (precio.isEmpty()){
            System.out.println("El carrito de compras no trae el precio total");
            driver.quit();
        }
        if (btnFinalizar.isEnabled()){

            btnFinalizar.click();
        }

    }

    public String validacionOverview() {
      String  mensajeTitulo= title.getText();
      if(mensajeTitulo.contains("Overview")){
          mensajeTitulo=title.getText();
        }
        return  mensajeTitulo;
    }


}
