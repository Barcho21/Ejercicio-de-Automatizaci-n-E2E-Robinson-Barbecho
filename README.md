# README

## 1. Prerrequisitos

Para ejecutar correctamente las pruebas automatizadas, asegúrate de contar con el siguiente entorno configurado en tu máquina local:

- Sistema operativo: Windows 10 o superior
- IDE: IntelliJ IDEA versión 2023.1 o superior
- Maven: versión 3.8.6 (agregado a la variable de entorno PATH)
- JDK: versión 11 (agregado a la variable de entorno JAVA_HOME)
- Navegador: Google Chrome versión 141.0 o compatible
- Driver: chromedriver.exe configurado en la carpeta src/test/resources/drivers

## 2. Comandos de instalación

Ejecuta los siguientes comandos para preparar el entorno y descargar todas las dependencias necesarias:

```bash
mvn clean install -DskipTests
```

Este comando descarga todas las dependencias del archivo pom.xml y configura correctamente el proyecto en tu entorno local.

## 3. Instrucciones para ejecutar los test

Sigue los pasos a continuación para ejecutar las pruebas E2E en SauceDemo:

1. Abre el proyecto saucedemo-e2e en IntelliJ IDEA.
2. Asegúrate de tener configurado correctamente el archivo serenity.conf en la ruta:
   ```
   src/test/resources/serenity.conf
   ```
3. Verifica que la clase CustomChromeDriver.java esté ubicada en:
   ```
   src/test/java/com/saucedemo/utils/CustomChromeDriver.java
   ```
4. Ejecuta el siguiente comando en la terminal del proyecto:

   ```bash
   mvn clean verify -U && start target/site/serenity/index.html
   ```

   Esto ejecutará el flujo E2E completo de compra en SauceDemo y abrirá automáticamente el reporte Serenity generado.

5. En caso de querer ejecutarlo sin abrir el reporte automáticamente:
   ```bash
   mvn clean verify -U
   ```

## 4. Información adicional

Sobre el popup “Cambia tu contraseña”  
De vez en cuando, durante la ejecución de las pruebas, puede aparecer una ventana emergente de Chrome que dice:  
“La contraseña que acabas de usar se ha encontrado en una brecha de seguridad de datos...”  

Este popup es intermitente y depende del navegador.  
Si aparece, el test podría fallar temporalmente, ya que bloquea los botones del carrito o checkout.  
Solución recomendada:  
Simplemente ejecuta nuevamente el test (mvn clean verify -U) hasta que se complete correctamente.  
En la mayoría de los casos, el popup no aparece en ejecuciones posteriores.

## Referencia

https://github.com/Barcho21/Ejercicio-de-Automatizaci-n-E2E-Robinson-Barbecho