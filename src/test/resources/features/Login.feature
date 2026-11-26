Feature: Login
  Background: Precondicion
    Given Se navega a la pagina de Login

  #Scenario: Credenciales incorrectas
  #  When Se escribe el username "hola"
  #  And Se escribe el password "adios"
  #  And Se hace clic en el boton de login
  #  Then Se verifica que el mensaje de error es "Epic sadface: Username and password do not match any user in this service"

  Scenario: Credenciales incorrectas
    When Se completa el formulario con el username "hola" y el password "adios"
    Then Se verifica que el mensaje de error es "Epic sadface: Username and password do not match any user in this service"