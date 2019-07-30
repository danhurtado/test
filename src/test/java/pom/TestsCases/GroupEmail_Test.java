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

    @Test
    public void OnlyContactsFirstTypeNow() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyContactsFirstTypeNow();
    }

    @Test
    public void OnlyContactsFirstTypeLater6amNoon() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyContactsFirstTypeLater6amNoon();
    }

    @Test
    public void OnlyContactsFirstTypeLaterNoon6PM() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyContactsFirstTypeLaterNoon6PM();
    }

    @Test
    public void OnlyContactsFirstTypeLater6PMMidnight() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyContactsFirstTypeLater6PMMidnight();
    }

    @Test
    public void OnlyTeachersPeriod1Now() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyTeachersPeriod1Now();
    }

    @Test
    public void OnlyTeachersPeriod1Later6amNoon() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyTeachersPeriod1Later6amNoon();
    }

    @Test
    public void OnlyTeachersPeriod1LaterNoon6PM() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyTeachersPeriod1LaterNoon6PM();
    }

    @Test
    public void OnlyTeachersPeriod1Later6PMMidnight() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyTeachersPeriod1Later6PMMidnight();
    }

    @Test
    public void OnlyAlumniNow() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyAlumniNow();
    }

    @Test
    public void OnlyAlumniLater6amNoon() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyAlumniLater6amNoon();
    }

    @Test
    public void OnlyAlumniLaterNoon6PM() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyAlumniLaterNoon6PM();
    }

    @Test
    public void OnlyAlumniLater6PMMidnight() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyAlumniLater6PMMidnight();
    }

    @Ignore
    @Test
    public void All() throws InterruptedException, AWTException {
        groupEmailPage = new GroupEmailPage(driver);
        /*
        groupEmailPage.OnlyChaperonesNow();
        groupEmailPage.OnlyChaperonesLater6amNoon();
        groupEmailPage.OnlyChaperonesLaterNoon6PM();
        groupEmailPage.OnlyChaperonesLater6PMMidnight();
        groupEmailPage.OnlyHelpersNow();
        groupEmailPage.OnlyHelpersLater6amNoon();
        groupEmailPage.OnlyHelpersLaterNoon6PM();
        groupEmailPage.OnlyHelpersLater6PMMidnight();
        groupEmailPage.OnlyContactsFirstTypeNow();
        groupEmailPage.OnlyContactsFirstTypeLater6amNoon();
        groupEmailPage.OnlyContactsFirstTypeLaterNoon6PM();
        groupEmailPage.OnlyContactsFirstTypeLater6PMMidnight();
        groupEmailPage.OnlyTeachersPeriod1Now();
        groupEmailPage.OnlyTeachersPeriod1Later6amNoon();
        groupEmailPage.OnlyTeachersPeriod1LaterNoon6PM();
        groupEmailPage.OnlyTeachersPeriod1Later6PMMidnight();
        */
        groupEmailPage.OnlyAlumniNow();
        groupEmailPage.OnlyAlumniLater6amNoon();
        groupEmailPage.OnlyAlumniLaterNoon6PM();
        groupEmailPage.OnlyAlumniLater6PMMidnight();
    }

}
