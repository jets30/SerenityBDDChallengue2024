@End
Feature: Realizar compra de productos
  #Como usuario registrado , quiero acceder a https://www.saucedemo.com para realizar al compra de un producto
  Background:
    Given el usuario navega en la pagina de inicio de sesion

  Scenario Outline: Realizar compra exitosa
    Given usuario ingresa "<usuario>" y "<password>"
    When el usuario agrega una <cantidad> de productos
    And se dirige al carro de compras
    And completa el formulario de compras ingresando "<nombre>","<apellido>" y "<codigoPsostal>",
    When le da click en finalizar
    Then finaliza la compra exitosamente
    Examples:
      | usuario       | password     | cantidad | nombre |  | apellido | codigoPsostal |
      | standard_user | secret_sauce | 2        | Juan   |  | Werner   | 45            |