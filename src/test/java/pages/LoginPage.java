package pages;


import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "username")
    private WebElementFacade nombreUsuario;
    @FindBy(name = "password")
    private WebElementFacade passwordUsuario;
    @FindBy(id = "sign_in_btnundefined")
    private WebElementFacade botonLogin;
    @FindBy(id = "menuUserLink")
    private WebElementFacade botonLogueo;

    public WebElementFacade getNombreUsuario() {
        return nombreUsuario;
    }

    public WebElementFacade getPasswordUsuario() {
        return passwordUsuario;
    }

    public WebElementFacade getBotonLogin() {
        return botonLogin;
    }

    public WebElementFacade getBotonLogueo() {
        return botonLogueo;
    }
}

