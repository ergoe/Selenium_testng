package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private static final int TIMEOUT = 3;
    private static final int POLLING = 100;

    protected RemoteWebDriver webDriver;
    private WebDriverWait wait;

    protected String baseURL = "http://the-internet.herokuapp.com/";

    public BasePage(RemoteWebDriver driver) {
        this.webDriver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
    }
}
