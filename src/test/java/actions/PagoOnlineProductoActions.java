package actions;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.PagoOnlineProductoPage;

public class PagoOnlineProductoActions extends PagoOnlineProductoPage {
    public PagoOnlineProductoActions(WebDriver driver) {
        super(driver);
    }

    //se valida que el usuario este dentro de la pagina cuando hace pago en linea
    public void validarPagoLinea() {
        Assert.assertEquals("El titulo deberia ser igual",
                getTituloOrdenPago().getText(), "ORDER PAYMENT");
    }

    public boolean vaidarInformacionEditar() {
        getBotonEditarInfo().click();
        boolean nombre = getNombreUsuarioPago().isEnabled();
        boolean apellido = getApellidoUsuarioPago().isEnabled();
        boolean telefono = getTelefonoOrdenEnvio().isEnabled();
        boolean continente = getContinenteUsuarioPago().isEnabled();
        boolean ciudad = getCiudadUsuarioPago().isEnabled();
        boolean direccion = getDireccionUsuarioPago().isEnabled();
        boolean codPostal = getCodPostalUsuarioPago().isEnabled();
        boolean provincia = getProvincia().isEnabled();

        if ((nombre && apellido && telefono && continente && ciudad && direccion && codPostal && provincia) == true) {
            return true;
        } else {
            return false;
        }

    }
    public void FinalizarDetallesEnvio(){

        getBotonNet1().click();
    }

    public void validarMetodosPago() {
        //getTituloShippingDetails().waitUntilPresent();
        /*Assert.assertEquals("Los titulos del detalle de compra debe coincidir",
                    getTituloShippingDetails().getText(), Matchers.equalTo("1. SHIPPING DETAILS "));
        */
        //getTituloShippingDetails().waitUntilVisible();
        //System.out.println(getTituloShippingDetails().getText()+"**********************");
        getBotonNext().click();

    }


    public void pantallaMetodosPago() {
        getTituloFormaPago().waitUntilPresent();
        Assert.assertEquals("Los titulos de metodos de pago deberian coincidir",
                getTituloFormaPago().getText(), "2. PAYMENT METHOD");

    }

    public void seleccionMetodoPago() {
        getBotonComprarMasterCredit().click();


    }

    public void validarCamposConTexto() {
        getBotonEditarMasterCredit().waitUntilPresent();
        getBotonEditarMasterCredit().click();

        String numeroTarjeta = getNumeroTarjetaUsuarioPago().getAttribute("value");
        String numeroCvv = getCvvNumeroUsuarioPago().getAttribute("value");
        String mesCaducidad = getMesExpiracionUsuarioPago().getAttribute("value");
        String yearCaducidad = getYearExpiracionUsuarioPago().getAttribute("value");
        String nombreTitular = getNombreTitularUsuarioPago().getAttribute("value");
        //! diferente a vacio Empty
        if (!(numeroTarjeta.isEmpty() && numeroCvv.isEmpty() && mesCaducidad.isEmpty() && yearCaducidad.isEmpty() && nombreTitular.isEmpty())) {
            // getBtnAnterior().click();
            // getBtnNext1().click();
            getBotonPagarAhora().waitUntilPresent();
            getBotonPagarAhora().click();
        }
    }

    public void validarMensajeConfirmacionCompra() {
        //MartcherAssert es para comprar dos valores
        MatcherAssert.assertThat("El metodo de pago deberia coincir",
                getModoPagoOrdenEnvio().getText(), Matchers.equalTo("MasterCredit\n**** **** **** 9098"));

        Assert.assertEquals("La direccion deberia coincidir",
                getDireccionOrdenEnvio().getText(), "calle 15a # 2a-12");

        MatcherAssert.assertThat("El resumen de la orden deberia estar presente",
              getResumenOrden().isVisible(),Matchers.is(true));

        MatcherAssert.assertThat("El numero de seguimiento deberia estar presente",
                getNumeroSeguimiento().isVisible(),Matchers.is(true));

      }


    }
