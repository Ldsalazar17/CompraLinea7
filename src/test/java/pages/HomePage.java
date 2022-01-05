package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@id,'laptopsImg')]")
    private WebElementFacade categoriaLaptops;

    @FindBy(id = "shoppingCartLink")
    private WebElementFacade botonCarritoCompras;

    @FindBy(xpath = "//button[contains(@name,'buy_now')]")
    private WebElementFacade botonComprar;

    @FindBy(xpath = "//button[contains(@name,'save_to_cart')]")
    private WebElementFacade botonAddCarrito;

    @FindBy(xpath = "(//img[contains(@class,'imageUrl')])[2]")
    private WebElementFacade imagenProductoLinea;

    @FindBy(xpath = "//label[@class='roboto-regular productName ng-binding']")
    private WebElementFacade nombreProductoLinea;

    @FindBy(xpath = "//span[contains(@class,'productColor')]")
    private WebElementFacade colorProducto;

    @FindBy(xpath = "(//label[contains(@class,'ng-binding')])[7]")
    private WebElementFacade cantidadProducto;

    @FindBy(xpath = "(//p[contains(@class,'price roboto-regular ng-binding')])[2]")
    private WebElementFacade precioProducto;

    @FindBy(xpath = "(//img[contains(@class,'imageUrl')])[1]")
    private WebElementFacade imgProductoRecuadro;

    @FindBy(xpath = "(//label[@class='ng-binding'])[1]")
    private WebElementFacade cantProductoRecuadro;

    @FindBy(xpath = "(//h3[contains(@class,'ng-binding')])[1]")
    private WebElementFacade nombreProductoRecuadro;

    @FindBy(xpath = "(//label[@class='ng-binding']//span[@class='ng-binding'])[1]")
    private WebElementFacade colorProductoRecuadro;

    @FindBy(xpath = "//p[contains(@class,'price roboto-regular ng-binding')]")
    private WebElementFacade precioProductRecuadro;

    @FindBy(xpath = "(//a//label[@class='ng-binding'])[1]")
    private WebElementFacade numeroArticulos;

    @FindBy(id = "checkOutPopUp")
    private WebElementFacade botonCheckOut;

    public WebElementFacade getBotonCheckOut() {
        return botonCheckOut;
    }

    public WebElementFacade getNumeroArticulos() {
        return numeroArticulos;
    }

    public WebElementFacade getImgProductoRecuadro() {
        return imgProductoRecuadro;
    }

    public WebElementFacade getCantProductoRecuadro() {
        return cantProductoRecuadro;
    }

    public WebElementFacade getNombreProductoRecuadro() {
        return nombreProductoRecuadro;
    }

    public WebElementFacade getColorProductoRecuadro() {
        return colorProductoRecuadro;
    }

    public WebElementFacade getPrecioProductRecuadro() {
        return precioProductRecuadro;
    }

    public WebElementFacade getColorProducto() {
        return colorProducto;
    }

    public WebElementFacade getCantidadProducto() {
        return cantidadProducto;
    }

    public WebElementFacade getPrecioProducto() {
        return precioProducto;
    }

    public WebElementFacade getBotonComprar() {
        return botonComprar;
    }

    public WebElementFacade getBotonAddCarrito() {
        return botonAddCarrito;
    }
    public WebElementFacade getCategoriaLaptops() {
        return categoriaLaptops;
    }
    public WebElementFacade getBotonCarritoCompras() {
        return botonCarritoCompras;
    }
    public WebElementFacade getImagenProductoLinea() {
        return imagenProductoLinea;
    }

    public WebElementFacade getNombreProductoLinea() {
        return nombreProductoLinea;
    }
}
