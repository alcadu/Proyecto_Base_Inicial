package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Login;

import java.util.concurrent.TimeUnit;

public class CPA_001Login {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.gecko.driver", ".\\DriverNavegador\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test()
    public void login(){
        Login login = new Login( driver);
        login.loginWeb( "mngr259694","ygazare" );
    }





}
