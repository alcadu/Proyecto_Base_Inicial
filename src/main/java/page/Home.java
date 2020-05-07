package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

    private WebDriver driver;

    public Home(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "  //*[@name=\"uid\"]")
    private static WebElement inputuser;
    @FindBy(name = "password")
    private static WebElement inputpass;
    @FindBy(name = "btnLogin")
    private static WebElement btnLogin;


}
