import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.openLoginPage();
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertEquals("http://the-internet.herokuapp.com/secure", getWebDriver().getCurrentUrl());
    }
}
