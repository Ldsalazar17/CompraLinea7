package actions;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomeActions extends HomePage {

    public HomeActions(WebDriver driver) {
        super(driver);
    }


    public void seleccionarProductoLinea() {
        //   WebElement producto = getDriver().findElement(By.xpath("//div[contains(@id,'" + articulo + "Img')]"));
        getCategoriaLaptops().click();
        //   JavascriptExecutor js = (JavascriptExecutor) getDriver();
        //    js.executeScript("arguments[0].click()", producto);
        getBotonComprar().click();
        getBotonAddCarrito().click();


    }


    public void validarProducto() {
        getNumeroArticulos().waitUntilPresent();

        //el 1 es para que me traiga el 10
        System.out.println(getNumeroArticulos().getText().split(" ")[1]+"***************************************");

        getBotonCarritoCompras().click();
        //DETALLES DEL PRODUCTO EN EL CARRITO DE COMPRAS
        //src es el link de la imagen para que lo traiga y el get Atribute es de web element que trae el atributo de la etiqueta cualquier atributo
        String imgProductoPagina = getImagenProductoLinea().getAttribute("src");
        String nombreProductoPag = getNombreProductoLinea().getText();
        String colorProductoPag = getColorProducto().getAttribute("title");
        String cantidadProdcutoPag = getCantidadProducto().getText();
        String precioProductoPag = getPrecioProducto().getText();


        // DETALLES DEL PRODUCTO EN EL RECUADRO DE COMPRAS

        //metodo que indica la posicion que quiero y seprar campos
         String cantidadRecuadro = getNumeroArticulos().getText().split(" ")[1];
         String precioProducRecuadro = getPrecioProductRecuadro().getText();
         String imagenRecuadto = getImgProductoRecuadro().getAttribute("src");
         String nombreRecuadro = getNombreProductoRecuadro().getText();
         String colorRecuadro = getColorProductoRecuadro().getText();

        Assert.assertEquals("La cantidad de producto deberia coinidir",
                cantidadRecuadro, cantidadProdcutoPag);
        Assert.assertEquals("El precio del producto deberia coincidir",
                precioProducRecuadro, precioProductoPag);
        assertThat("El src deberia coincidir", imgProductoPagina, Matchers.is(imagenRecuadto));
        assertThat("El nombre del producto deberia coincidir", nombreProductoPag, Matchers.is(nombreRecuadro));
        assertThat("El color del producto deberia coincidir", colorProductoPag, Matchers.is(colorRecuadro));
        moverSobreProducto(By.id("shoppingCartLink"));
        getBotonCheckOut().click();

    }
    public void validarCompra(){
        moverSobreProducto(By.id("shoppingCartLink"));
        getBotonCheckOut().click();
    }

    //by es un paramertro del mapeo
    public void moverSobreProducto(By by){
        Actions actions = new Actions(getDriver());
        actions.moveToElement
                (getDriver().findElement(by)).build().perform();
    }



}