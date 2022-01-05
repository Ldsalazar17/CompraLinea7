package stepsDefinitions;


import actions.HomeActions;
import actions.LoginActions;
import actions.PagoOnlineProductoActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class PagoLineaSteps {

    @Managed
    WebDriver driver;
    LoginActions loginActions = new LoginActions(driver);
    HomeActions homeActions = new HomeActions(driver);
    PagoOnlineProductoActions pagoOnlineProductoActions = new PagoOnlineProductoActions(driver);

    @Given("^que el usuario se encuentre en la pagina principal$")
    public void queElUsuarioSeEncuentreEnLaPaginaPrincipal() {
        homeActions.open();
    }

    @Given("^el usuario ingresa con sus datos a su cuenta$")
    public void elUsuarioIngresaConSusDatosASuCuenta() {
        loginActions.logueoUsuario();
    }

    @When("^selecciona el articulo de tecnologia que desee comprar$")
    public void seleccionaElArticuloDeTecnologiaQueDeseeComprar() {
        homeActions.seleccionarProductoLinea();

    }


    @Then("^el usuario deberia ver el producto seleccionado en el carrito de compras$")
    public void elUsuarioDeberiaVerElProductoSeleccionadoEnElCarritoDeCompras() {
        homeActions.validarProducto();
    }
//segundo escenario
    @Given("^que el usuario se encuentre en la seccion de pago$")
    public void queElUsuarioSeEncuentreEnLaSeccionDePago() {
      homeActions.open();
      loginActions.logueoUsuario();
     homeActions.seleccionarProductoLinea();
     homeActions.validarCompra();


    }

    @When("^el usuario verifica donde llega su producto$")
    public void elUsuarioVerificaDondeLlegaSuProducto () {
       pagoOnlineProductoActions.vaidarInformacionEditar();

        }

    @Then("^el usuario deberia poder ver los metodos de pago$")
        public void elUsuarioDeberiaPoderVerLosMetodosDePago () {
       pagoOnlineProductoActions.FinalizarDetallesEnvio();
       pagoOnlineProductoActions.validarPagoLinea();

        }
        //tercer escenario
    @Given("^que el usuario se encuntre en la pantalla de metodo de pago$")
    public void queElUsuarioSeEncuntreEnLaPantallaDeMetodoDePago() {
        homeActions.open();
        loginActions.logueoUsuario();
      //  homeActions.seleccionarProductoLinea();
       homeActions.validarCompra();
        pagoOnlineProductoActions.validarPagoLinea();
        pagoOnlineProductoActions.validarMetodosPago();

       pagoOnlineProductoActions.pantallaMetodosPago();
    }

    @When("^el usuario escoge el metodo de pago master credit$")
    public void elUsuarioEscogeElMetodoDePagoMasterCredit() {
       pagoOnlineProductoActions.seleccionMetodoPago();
    }

   @When("^verifique que se pueda editar la informacion de master credit$")
   public void verifiqueQueSePuedaEditarLaInformacionDeMasterCredit() {
       pagoOnlineProductoActions.validarCamposConTexto();
   }

    @Then("^el usuario vera la orden de pago$")
    public void elUsuarioVeraLaOrdenDePago() {
       pagoOnlineProductoActions.validarMensajeConfirmacionCompra();
    }

    }