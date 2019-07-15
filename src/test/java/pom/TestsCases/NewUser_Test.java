package pom.TestsCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pom.Pages.LoginPage;
import pom.Pages.NewStudentPage;
import pom.Settings;

public class NewUser_Test {

    private WebDriver driver;
    NewStudentPage newStudentPage;
    LoginPage loginPage;

    @Before
    public void setUp() throws InterruptedException {
        loginPage = new LoginPage(driver);
        driver = loginPage.Browser(Settings.BROWSER);
        loginPage.Login();

    }

    @After
    public void tearDown(){
        loginPage.closeConection();
    }

    @Test
    public void Test() throws InterruptedException {
        newStudentPage = new NewStudentPage(driver);
        newStudentPage.AddNewStudent();

    }
}
