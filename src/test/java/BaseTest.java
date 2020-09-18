import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest {

//    public WebDriver driver;
    CrossBrowserRemoteWebDriver driver;
    private RemoteWebDriver webDriver;
    public String browser;



    @BeforeMethod
    public void setupTest() {
        driver = new CrossBrowserRemoteWebDriver();
        browser = "chrome";
        try {
            webDriver = driver.createInstance(browser);
        } catch (MalformedURLException mfe) {

        }
        if (webDriver == null) {
            webDriver = new ChromeDriver();
        }
//
    }

    @AfterMethod
    public void afterTest() {
        webDriver.close();
    }

    public RemoteWebDriver getWebDriver() {
        return webDriver;
    }



}
