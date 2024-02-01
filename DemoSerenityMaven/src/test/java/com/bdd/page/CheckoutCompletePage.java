package com.bdd.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends PageObject {


@FindBy(xpath = "//h2[@class='complete-header']")
private WebElementFacade messageSuccessful;

    public String validarMensaje() {

      String mensaje= messageSuccessful.getText();;

      if (mensaje.matches("^[A-Za-z\\s!]+$")){
          mensaje = messageSuccessful.getText();
      }
        return mensaje;
    }
}
