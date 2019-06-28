package pom.TestsCases;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pom.Pages.LoginPage;
import pom.Pages.NewUniformPage;

public class NewUniformItem_Test {

    private WebDriver driver;
    //NewStudentPage newStudentPage;
    NewUniformPage newUniformPage;

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
        newUniformPage = new NewUniformPage(driver);
        newUniformPage.AddNewUniform();

    }
}
