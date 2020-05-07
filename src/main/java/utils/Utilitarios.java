package utils;

import org.openqa.selenium.WebDriver;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Utilitarios {

    private WebDriver webDriver;


    public static void tamanoPantalla() throws AWTException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int altura = screenSize.height;
        int ancho = screenSize.width;

        if(altura == 768 && ancho == 1366){
            clickPantalla14();
        }
        if(altura == 1080 && ancho == 1920){
            clickPantalla15();
        }

    }

    public static void clickPantalla14() throws AWTException{

        Robot bot = new Robot();
        bot.mouseMove(906,702);
        esperar( 4 );
        bot.mousePress( InputEvent.BUTTON1_MASK);
        bot.mouseRelease( InputEvent.BUTTON1_MASK);
    }
    public static void clickPantalla15() throws AWTException{

        Robot bot = new Robot();
        bot.mouseMove(1180,1015);
        esperar( 4 );
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease( InputEvent.BUTTON1_MASK);
    }

    public static void presionaEnterWindows() throws InterruptedException, AWTException {
        Robot r = new Robot();
        r.keyPress( KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void presionaCancelarWindows() throws InterruptedException, AWTException {
        esperar( 2 );
        Robot r = new Robot();
        r.keyPress( KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        esperar( 1 );
        r.keyPress( KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        esperar( 1 );
        r.keyPress( KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        esperar( 1 );
        r.keyPress( KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        esperar( 1 );
        r.keyPress( KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }


    public static void esperar(int tiempo){
        try{
            Thread.sleep( tiempo * 1000 );
        }catch (InterruptedException io){
            System.out.println(">>> "+io);
        }
    }


}

