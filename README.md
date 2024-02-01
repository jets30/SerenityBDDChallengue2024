SerenityBDD Challengue
=============
### 1. Pre-requisitos:

- Maquina local con el sistema operativo Windows 10
- IntelliJ IDEA Community Edition  version 2023.2.5
- Maven version 3.9.5 (debe estar en la variable de entorno)
- JDK versión 1.8 (debe estar en la variable de entorno)

### 2. Comandos de instalación

- mvn install -DskipTests (descarga todas las dependencias del POM)

### 3. Instrucciones para ejecutar los test

######				 Ejecución
- Ejecutar desde el Runner que está en src/test/java/com/bdd/runner/RunnerTest.java con click derecho 'Run RunnerTest'

###### 				Reporte
- Para obtener el reporte de la ejecución se debe ejecutar desde DemoSerenityMaven [clean,verify...] el cual está situado en la parte superior IntelliJ IDEA - run configurations
- El reporte se generará dentro del carpeta target en la siguiente ruta: target/site/serenity/index.html
- Seleccionar el index.html, click derecho y seleccionar Open In/Browser


### 4. Información adicional
-  La ejecución tendrá un resultado fallido,  ya que según las indicaciones el mensaje a validar es "THANK YOU FOR YOUR ORDER". Pero este mensaje no está al finalizar a compra.
- Si se requiere obtener una ejecución exitosa solo se debe actualizar el mensaje correcto en el CheckoutCompleteStepDefinition  el cual está dentro de la carpeta step.
- Ruta de CheckoutCompleteStepDefinition : src/test/java/com/bdd/step/CheckoutCompleteStepDefinition.java.
- El mensaje correcto para que la ejecución sea exitosa es Thank you for your order!
