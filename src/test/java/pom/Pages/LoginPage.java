package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.Base;
import pom.Config;
import pom.Settings;

import static junit.framework.TestCase.assertEquals;

public class LoginPage extends Base {

    By UsernameLocator = By.id("username");
    By PasswordLocator = By.name("passwd");
    By LoginBtn = By.id("test");
    By TitlePageLocator = By.xpath("//h1[@class='h124']");

    Config config = new Config(Settings.ENVIRONMENT);

    //String LOGINPAGE = "http://qa.charmsofficetest.com/charms_qa/login.asp";
    String LOGINPAGE = config.url+"/login.asp";

    public LoginPage(WebDriver driver) { super(driver); }

    public void Login() throws InterruptedException {
        //public void Login(String environment) throws InterruptedException {

        visit(LOGINPAGE);
        //wait(3);
        //visit(environment+LOGINPAGE);
        type(config.user, UsernameLocator);
        type(config.pass,PasswordLocator);
        submit(LoginBtn);
        wait(1);

        assertEquals("WELCOME",left(getText(TitlePageLocator),7));
        //System.out.println(right(getText(TitlePageLocator),5));

    }


}
