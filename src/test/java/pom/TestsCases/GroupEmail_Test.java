package pom.TestsCases;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pom.Pages.GroupEmailPage;
import pom.Pages.LoginPage;

public class GroupEmail_Test {

    private WebDriver driver;
    //NewStudentPage newStudentPage;
    GroupEmailPage groupEmailPage;

    LoginPage loginPage;

    @Before
    public void setUp() throws InterruptedException {
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriver();
        loginPage.Login();

    }

    @After
    public void tearDown(){
        //driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {
        groupEmailPage = new GroupEmailPage(driver);
        groupEmailPage.OnlyChaperones();

    }
}
