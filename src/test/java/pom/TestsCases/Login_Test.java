package pom.TestsCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pom.Config;
import pom.Pages.LoginPage;


public class Login_Test{

    private WebDriver driver;
    LoginPage loginpage;


    @Before
    public void setUp(){
        loginpage = new LoginPage(driver);
        driver = loginpage.chromeDriver();
    }

    @After
    public void tearDown(){
        //driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {
        //loginpage.Login(Config.Environment);
        loginpage.Login();

    }
}
