package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.Base;

import static junit.framework.TestCase.assertEquals;

public class LoginPage extends Base {

    By UsernameLocator = By.id("username");
    By PasswordLocator = By.name("passwd");
    By LoginBtn = By.id("test");
    By TitlePageLocator = By.xpath("//h1[@class='h124']");

    String LOGINPAGE = "http://qa.charmsofficetest.com/charms_qa/login.asp";

    public LoginPage(WebDriver driver) { super(driver); }

    public void Login() throws InterruptedException {

        visit(LOGINPAGE);
        type("tester", UsernameLocator);
        type("password1",PasswordLocator);
        submit(LoginBtn);
        wait(1);

        assertEquals("WELCOME Tester ",getText(TitlePageLocator));

    }


}
