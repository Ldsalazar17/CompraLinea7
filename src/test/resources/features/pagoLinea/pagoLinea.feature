@test
Feature: Yo como usuario del portal Demo
  Quiero hacer compras de productos de tecnologia en linea

  @seccion1
  Scenario: el usuario selecciona articulos de tecnologia y realiza el pago en linea
    Given que el usuario se encuentre en la pagina principal
    And el usuario ingresa con sus datos a su cuenta
    When selecciona el articulo de tecnologia que desee comprar
    Then el usuario deberia ver el producto seleccionado en el carrito de compras

 @seccion2
  Scenario: el usuario verifica los detalles del envio del producto Tablet
    Given que el usuario se encuentre en la seccion de pago
    When el usuario verifica donde llega su producto
    Then el usuario deberia poder ver los metodos de pago

  @seccion3

  Scenario: el usuario escoge el metodo de pago Master Credit
    Given que el usuario se encuntre en la pantalla de metodo de pago
    When el usuario escoge el metodo de pago master credit
    And verifique que se pueda editar la informacion de master credit
    Then el usuario vera la orden de pago

 # @seccion4
  #Escenario valido el bug de pay now

 # Scenario: El usuario no puede acceder al boton Pay Now
  #  Given que el usuario se encuntre en la seccion detalle de envio
  #  When el usuario edita la informacion del detalle de envio
  #  And ingresa a la seccion metodos de pago
  #  Then el usuario deberia poder hacer el pago

