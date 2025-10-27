Feature: Compra exitosa en SauceDemo
  Como usuario autenticado
  Quiero realizar una compra completa
  Para verificar el flujo E2E de la página SauceDemo

  Scenario: Flujo completo de compra
    Given que el usuario accede a la página de SauceDemo
    When inicia sesión con credenciales válidas
    And agrega dos productos al carrito
    And visualiza el carrito y continúa con la compra
    And completa el formulario de datos con "Robinson" "Barbecho" "170514"
    And finaliza la compra
    Then debe ver el mensaje "Thank you for your order!"