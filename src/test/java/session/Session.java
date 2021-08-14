package session;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {
    private static Session session = null;
    private WebDriver driver;
    private Session(){
        driver= FactoryBrowser.make("proxy").create();

    }

    public static  Session getInstance(){
        if (session == null)
            session= new Session();
        return session;
    }
    public void closeSession(){
        driver.quit();
        session=null;
    }

    public WebDriver getDriver() {
        return driver;
    }
    public void maxime() {
        driver.manage().window().maximize();
    }
}
