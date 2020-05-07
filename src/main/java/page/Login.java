package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.Utilitarios.esperar;

public class Login {
    private WebDriver driver;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "  //*[@name=\"uid\"]")
    private static WebElement inputuser;
    @FindBy(name = "password")
    private static WebElement inputpass;
    @FindBy(name = "btnLogin")
    private static WebElement btnLogin;

    public void loginWeb (String user, String pass){
        esperar(3);
        inputuser.sendKeys( user );
        inputpass.sendKeys( pass );
        btnLogin.click();
    }
}