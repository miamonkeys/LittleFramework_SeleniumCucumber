Feature: Funcionalidad de login en la página principal de la Oficina Virtual

Rule: El usuario iniciará sesión con su usuario y contraseña correcta

Background: Navegar a la página e ignorar el alert box
    Given Yo navego a la página principal
    When Yo ignoro el alert box

Scenario: Como usuario, yo quiero iniciar sesión
    And Yo escribo mi usuario y contraseña
    Then Yo doy click en el botón ingresar
