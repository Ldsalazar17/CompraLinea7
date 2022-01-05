package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PagoOnlineProductoPage extends BasePage {
    public PagoOnlineProductoPage(WebDriver driver) {
        super(driver);


    }

    @FindBy(xpath = "//h3[@class='roboto-regular sticky fixedImportant ng-scope'][contains(.,'ORDER PAYMENT')]")
    private WebElementFacade tituloOrdenPago;
    @FindBy(xpath = "//a[@role='link'][contains(.,'Edit shipping details')]")
    private WebElementFacade botonEditarInfo;
    @FindBy(name = "first_name")
    private WebElementFacade nombreUsuarioPago;
    @FindBy(name = "last_name")
    private WebElementFacade apellidoUsuarioPago;
    @FindBy(name = "phone_number")
    private WebElementFacade telefonoUsuarioPago;
    @FindBy(name = "countryListbox")
    private WebElementFacade continenteUsuarioPago;
    @FindBy(name = "city")
    private WebElementFacade ciudadUsuarioPago;
    @FindBy(name = "address")
    private WebElementFacade direccionUsuarioPago;
    @FindBy(name = "postal_code")
    private WebElementFacade codPostalUsuarioPago;
    @FindBy(name = "state_/_province_/_region")
    private WebElementFacade provincia;
    @FindBy(name = "//label[contains(@class,'roboto-regular ng-binding selected')]")
    private WebElementFacade tituloShippingDetails;
    @FindBy(xpath= "//button[@id='next_btn']")
    private WebElementFacade botonNext;
    @FindBy(xpath = "//label[contains(@translate,'Choose_payment_method_below')]")
    private WebElementFacade tituloMetodosPago;
    @FindBy(xpath = "//label[@class='roboto-regular ng-binding selected']")
    private WebElementFacade tituloFormaPago;
    @FindBy(id = "pay_now_btn_SAFEPAY")
    private WebElementFacade botonComprarSafePay;
    @FindBy(xpath = "(//div[@class='paymentMethods']/div/img)[2]")
    private WebElementFacade botonComprarMasterCredit;
    @FindBy(xpath = "//button[@id='pay_now_btn_MasterCredit']")
    private WebElementFacade botonPayNowMasterCredit;
    @FindBy(xpath = "//button[contains(@id,'pay_now_btn_ManualPayment')]")
    private WebElementFacade botonPagarAhora;
    @FindBy(xpath = "//label[@class='edit  ng-scope']")
    private WebElementFacade botonEditarMasterCredit;
    @FindBy(xpath = "//input[contains(@id,'creditCard')]")
    private WebElementFacade numeroTarjetaUsuarioPago;
    @FindBy(name = "cvv_number")
    private WebElementFacade cvvNumeroUsuarioPago;
    @FindBy(name = "mmListbox")
    private WebElementFacade mesExpiracionUsuarioPago;
    @FindBy(name = "yyyyListbox")
    private WebElementFacade yearExpiracionUsuarioPago;
    @FindBy(name = "cardholder_name")
    private WebElementFacade nombreTitularUsuarioPago;
    @FindBy(xpath = "//span[@class='roboto-regular ng-scope'][contains(.,'Thank you for buying with Advantage')]")
    private WebElementFacade tituloConfirmacionPago;
    @FindBy(xpath = "//div[@class='iconCss iconUser']/following::label[@class='ng-binding'][1]")
    private WebElementFacade nombreOrdenEnvio;
    @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[7]")
    private WebElementFacade nombreDetalles;
    @FindBy(xpath = "//div[@class='innerSeccion']/following::label[@class='ng-binding'][1]")
    private WebElementFacade direccionOrdenEnvio;
    @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[8]")
    private WebElementFacade direccionDetalles;
    @FindBy(xpath = "//input[contains(@name,'phone_number')]")
    private WebElementFacade telefonoOrdenEnvio;
    @FindBy(xpath = "//div[@class='iconCss iconUser']/following::label[@class='ng-binding'][6]")
    private WebElementFacade modoPagoOrdenEnvio;
    @FindBy(xpath = "//div[@class='iconCss iconUser']/following::label[@class='ng-binding'][8]")
    private WebElementFacade precioProductoOrdenEnvio;
    @FindBy(xpath = "//span[contains(@translate,'Order_Summary')]")
    private WebElementFacade resumenOrden;
    @FindBy(xpath = "//div[@class='innerSeccion']/following::a[@class='floater ng-binding'][4]")
    private WebElementFacade totalOrdenProducto;
    @FindBy(id = "trackingNumberLabel")
    private WebElementFacade numeroSeguimiento;
    @FindBy(id = "orderNumberLabel")
    private WebElementFacade numeroOrden;
    @FindBy(xpath = "(//a[contains(@ng-click,'Back_to_shipping_details()')])[2]")
    private WebElementFacade btnAnterior;
    @FindBy(xpath = "//button[@id='next_btn']")
    private WebElementFacade btnNext1;
    @FindBy(xpath = " //button[contains(@id,'next_btnundefined')]")
    private WebElementFacade botonNet1;

    public WebElementFacade getBotonNet1() {
        return botonNet1;
    }

    public WebElementFacade getTituloOrdenPago() {
        return tituloOrdenPago;
    }

    public WebElementFacade getBotonEditarInfo() {
        return botonEditarInfo;
    }

    public WebElementFacade getNombreUsuarioPago() {
        return nombreUsuarioPago;
    }

    public WebElementFacade getApellidoUsuarioPago() {
        return apellidoUsuarioPago;
    }

    public WebElementFacade getTelefonoUsuarioPago() {
        return telefonoUsuarioPago;
    }

    public WebElementFacade getContinenteUsuarioPago() {
        return continenteUsuarioPago;
    }

    public WebElementFacade getCiudadUsuarioPago() {
        return ciudadUsuarioPago;
    }

    public WebElementFacade getDireccionUsuarioPago() {
        return direccionUsuarioPago;
    }

    public WebElementFacade getCodPostalUsuarioPago() {
        return codPostalUsuarioPago;
    }

    public WebElementFacade getProvincia() {
        return provincia;
    }

    public WebElementFacade getTituloShippingDetails() {
        return tituloShippingDetails;
    }

    public WebElementFacade getBotonNext() {
        return botonNext;
    }

    public WebElementFacade getTituloMetodosPago() {
        return tituloMetodosPago;
    }

    public WebElementFacade getTituloFormaPago() {
        return tituloFormaPago;
    }

    public WebElementFacade getBotonComprarSafePay() {
        return botonComprarSafePay;
    }

    public WebElementFacade getBotonComprarMasterCredit() {
        return botonComprarMasterCredit;
    }

    public WebElementFacade getBotonPayNowMasterCredit() {
        return botonPayNowMasterCredit;
    }

    public WebElementFacade getBotonPagarAhora() {
        return botonPagarAhora;
    }

    public WebElementFacade getBotonEditarMasterCredit() {
        return botonEditarMasterCredit;
    }

    public WebElementFacade getNumeroTarjetaUsuarioPago() {
        return numeroTarjetaUsuarioPago;
    }

    public WebElementFacade getCvvNumeroUsuarioPago() {
        return cvvNumeroUsuarioPago;
    }

    public WebElementFacade getMesExpiracionUsuarioPago() {
        return mesExpiracionUsuarioPago;
    }

    public WebElementFacade getYearExpiracionUsuarioPago() {
        return yearExpiracionUsuarioPago;
    }

    public WebElementFacade getNombreTitularUsuarioPago() {
        return nombreTitularUsuarioPago;
    }

    public WebElementFacade getTituloConfirmacionPago() {
        return tituloConfirmacionPago;
    }

    public WebElementFacade getNombreOrdenEnvio() {
        return nombreOrdenEnvio;
    }

    public WebElementFacade getNombreDetalles() {
        return nombreDetalles;
    }

    public WebElementFacade getDireccionOrdenEnvio() {
        return direccionOrdenEnvio;
    }

    public WebElementFacade getDireccionDetalles() {
        return direccionDetalles;
    }

    public WebElementFacade getTelefonoOrdenEnvio() {
        return telefonoOrdenEnvio;
    }

    public WebElementFacade getModoPagoOrdenEnvio() {
        return modoPagoOrdenEnvio;
    }

    public WebElementFacade getPrecioProductoOrdenEnvio() {
        return precioProductoOrdenEnvio;
    }

    public WebElementFacade getTotalOrdenProducto() {
        return totalOrdenProducto;
    }

    public WebElementFacade getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public WebElementFacade getNumeroOrden() {
        return numeroOrden;
    }

    public WebElementFacade getBtnAnterior() {
        return btnAnterior;
    }

    public WebElementFacade getBtnNext1() {
        return btnNext1;
    }
    public WebElementFacade getResumenOrden() {
        return resumenOrden;
    }
}