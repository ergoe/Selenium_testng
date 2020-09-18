package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends BasePage {
    public String loginPageUrl =  baseURL + "login";

    public LoginPage(RemoteWebDriver driver) {
        super(driver);
    }

    private WebElement usernameTextBox() {
        By usernameTextBox = By.id("username");
        return webDriver.findElement(usernameTextBox);
    }

    private WebElement passwordTextBox() {
        By passwordTextBox = By.id("password");
        return webDriver.findElement(passwordTextBox);
    }

    private WebElement loginButton() {
        By loginButton = By.cssSelector("form#login > button[type=\"submit\"]");
        return webDriver.findElement(loginButton);
    }

    /**
     *
     */
    public void openLoginPage() {
        webDriver.get(loginPageUrl);
    }

    /**
     *
     */
    public void clickLoginButton() {
        loginButton().click();
    }

    /**
     *
     * @param name
     */
    public void enterUsername(String name) {
        usernameTextBox().sendKeys(name);
    }

    /**
     *
     * @param password
     */
    public void enterPassword(String password) {
        passwordTextBox().sendKeys(password);
    }



}
