package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pom.Base;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class GroupEmailPage extends Base {

    By StudentsChBox = By.xpath("//*[@id=\"options-option\"]/li[1]/span/div/ins");
    By AdultsChBox = By.xpath("//*[@id=\"options-option\"]/li[2]/span/div/ins");
    By ChaperoneChBox = By.xpath("//*[@id=\"options-option\"]/li[3]/span/div/ins");
    By OnlyChapeChBox = By.xpath("//*[@id=\"options-more\"]/li[4]/span/div/ins");
    By AddressesTab = By.xpath("//*[@id=\"tab_addresses\"]/span");
    By ComposeTab = By.xpath("//*[@id=\"tab_compose\"]/span");
    By CCTxt = By.xpath("//*[@id=\"tp_compose\"]/div[2]/form/div/div/div/div[2]/div[8]/div/input");
    By BrowseBtn = By.xpath("//*[@id=\"tp_compose\"]/div[2]/form/div/div/div/div[2]/div[12]/div/div[2]/div/label");
    By PlusBtn1 = By.xpath("//*[@id=\"tp_compose\"]/div[2]/form/div/div/div/div[2]/div[12]/div/div[2]/div/div/button[1]");
    By PlusBtn2 = By.xpath("//*[@id=\"tp_compose\"]/div[2]/form/div/div/div/div[2]/div[12]/div/div[2]/div[2]/div/button[1]");
    By SubjectTxt = By.xpath("//*[@id=\"tp_compose\"]/div[2]/form/div/div/div/div[2]/div[13]/div/input");
    By BodyMailTxt = By.xpath("//*[@id=\"tp_compose\"]/div[2]/form/div/div/div/div[2]/div[14]/div[2]/textarea");
    By PlainTextBtn = By.xpath("//*[@id=\"tp_compose\"]/div[2]/form/div/div/div/div[1]/div/button[2]");
    By SendBtn = By.xpath("//button[@class='ce-send btn btn-success mb-1']");
    By Title = By.xpath("//*[@id=\"main-title\"]");
    By OverwriteBtn = By.xpath("//button[@class='ce-overwrite btn btn-danger']");

    String GROUPEMAILPAGE = "http://qa.charmsofficetest.com/charms_qa/groupemail.asp";
    String timestamp1, timestamp2, timestamp3;

    public GroupEmailPage(WebDriver driver) { super(driver); }

    public void OnlyChaperones() throws InterruptedException, AWTException {
        navigateTo(GROUPEMAILPAGE);
        wait(1);
        click(StudentsChBox);
        click(AdultsChBox);
        click(ChaperoneChBox);
        click(OnlyChapeChBox);
        timestamp1 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp1);
        click(AddressesTab);
        wait(1);
        click(ComposeTab);
        wait(1);
        click(PlainTextBtn);
        click(BrowseBtn);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp1+".png");
        click(PlusBtn1);
        timestamp2 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp2);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp2+".png");
        type("daniel.hurtado@vancopayments.com",CCTxt);
        type("Automated test, Only Chaperones",SubjectTxt);
        type("This mail should include 3 images to show how the options were set up",BodyMailTxt);
        wait(1);
        timestamp3 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp3);
        click(PlusBtn2);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp3+".png");
        wait(1);
        scrollToElement(Title);
        click(SendBtn);
        if (isDisplayed(OverwriteBtn)){
            wait(1);
            click(OverwriteBtn);
        }

    }
}
