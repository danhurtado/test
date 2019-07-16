package pom.TestsCases;

import org.junit.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import pom.Pages.GroupEmailPage;
import pom.Pages.LoginPage;
import pom.Settings;

import java.awt.*;

public class GroupEmail_Test {

    //private
    WebDriver driver;
    GroupEmailPage groupEmailPage;

    LoginPage loginPage;

    @Before
    public void setUp() throws Exception {
        loginPage = new LoginPage(driver);
        //driver = loginPage.chromeDriver();
        driver = loginPage.Browser(Settings.BROWSER);
        loginPage.Login();

    }

    @After
    public void tearDown()throws Exception{
        loginPage.closeConection();
    }

    /*@Test
    public void Test() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyChaperonesNow();
        groupEmailPage.OnlyChaperonesLater6amNoon();
        groupEmailPage.OnlyChaperonesLaterNoon6PM();
        groupEmailPage.OnlyChaperonesLater6PMMidnight();
        groupEmailPage.OnlyHelpersNow();
        groupEmailPage.OnlyHelpersLater6amNoon();
        groupEmailPage.OnlyHelpersLaterNoon6PM();
        groupEmailPage.OnlyHelpersLater6PMMidnight();
    }*/

    @Test
    public void OnlyChaperonesNow() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyChaperonesNow();
    }

    @Test
    public void OnlyChaperonesLater6amNoon() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyChaperonesLater6amNoon();
    }

    @Test
    public void OnlyChaperonesLaterNoon6PM() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyChaperonesLaterNoon6PM();
    }

    @Test
    public void OnlyChaperonesLater6PMMidnight() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyChaperonesLater6PMMidnight();
    }

    @Test
    public void OnlyHelpersNow() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyHelpersNow();
    }

    @Test
    public void OnlyHelpersLater6amNoon() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyHelpersLater6amNoon();
    }

    @Test
    public void OnlyHelpersLaterNoon6PM() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyHelpersLaterNoon6PM();
    }

    @Test
    public void OnlyHelpersLater6PMMidnight() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyHelpersLater6PMMidnight();
    }
}
