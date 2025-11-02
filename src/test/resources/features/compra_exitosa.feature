Feature: Compra exitosa en SauceDemo

  Scenario Outline: Flujo completo de compra con distintos datos
    Given que el usuario accede a la página de SauceDemo
    When inicia sesión con credenciales válidas
    And agrega dos productos al carrito
    And visualiza el carrito y continúa con la compra
    And completa el formulario de datos con "<nombre>" "<apellido>" "<cp>"
    And finaliza la compra
    Then debe ver el mensaje "<mensaje>"

    Examples:
      | nombre   | apellido  | cp      | mensaje                   |
      | Robinson | Barbecho  | 170514  | Thank you for your order! |
