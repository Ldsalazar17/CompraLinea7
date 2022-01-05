package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;


public class LoginActions extends LoginPage {
    public LoginActions(WebDriver driver) {
        super(driver);
    }

public void logueoUsuario() {
        //espera clickleable
        getBotonLogueo().waitUntilClickable();
        getBotonLogueo().click();
        getNombreUsuario().sendKeys("PruebaDaniela");
        getPasswordUsuario().sendKeys("123Dany");
   //para que no se Interponia un elemento
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
    //aparece en google
        js.executeScript("arguments[0].click()", getBotonLogin());
        }




}
