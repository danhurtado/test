package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.Base;
import pom.Config;
import pom.Settings;

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
    By ScheduleDate = By.name("ce-schedule-date");
    By SendDrp = By.name("ce-sendmode");
    By ScheduleTimeDrp = By.name("ce-schedule-time");
    By ConfirmEmailSent1 = By.xpath("//*[@id=\"growls\"]/div/div[2]");
    By ConfirmEmailSent2 = By.xpath("//*[@id=\"growls\"]/div[2]/div[2]");


    Config config = new Config(Settings.ENVIRONMENT);
    String GroupEmailPath = config.url+"/groupemail.asp";


    String timestamp1, timestamp2, timestamp3;
    String CCmails = "daniel.hurtado@vancopayments.com";

    public GroupEmailPage(WebDriver driver) { super(driver); }

    public void OnlyChaperonesNow() throws InterruptedException, AWTException {
        navigateTo(GroupEmailPath);
        wait(1);
        click(StudentsChBox);
        click(AdultsChBox);
        click(ChaperoneChBox);
        click(OnlyChapeChBox);
        timestamp1 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp1);
        click(AddressesTab);
        wait(1);
        timestamp2 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp2);
        click(ComposeTab);
        wait(1);
        click(PlainTextBtn);
        click(BrowseBtn);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp1+".png");
        click(PlusBtn1);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp2+".png");
        type(CCmails,CCTxt);
        type("Automated test, Only Chaperones Now",SubjectTxt);
        type("This mail should include 3 images to show how the options were set up",BodyMailTxt);
        click(BodyMailTxt);
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
        wait(5);
        waitUntilAppears(10,ConfirmEmailSent1);
        assertEquals("Success!",getText(ConfirmEmailSent1));
        wait(3);

    }

    public void OnlyChaperonesLater6amNoon() throws InterruptedException, AWTException {
        navigateTo(GroupEmailPath);
        wait(1);
        click(StudentsChBox);
        click(AdultsChBox);
        click(ChaperoneChBox);
        click(OnlyChapeChBox);
        timestamp1 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp1);
        click(AddressesTab);
        wait(1);
        timestamp2 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp2);
        click(ComposeTab);
        wait(1);
        click(PlainTextBtn);
        click(BrowseBtn);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp1+".png");
        click(PlusBtn1);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp2+".png");
        type(CCmails,CCTxt);
        selectFromDropdown(SendDrp,"Later");
        wait(1);
        clear(ScheduleDate);
        type(getTomorrowDate(),ScheduleDate);
        selectFromDropdown(ScheduleTimeDrp,"Between 6 AM and Noon");
        wait(1);
        type("Automated test, Only Chaperones Scheduled between 6 AM and Noon",SubjectTxt);
        type("This mail should include 3 images to show how the options were set up",BodyMailTxt);
        click(BodyMailTxt);
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
        waitUntilAppears(10,ConfirmEmailSent2);
        assertEquals("Success!",getText(ConfirmEmailSent2));
        wait(3);
    }

    public void OnlyChaperonesLaterNoon6PM() throws InterruptedException, AWTException {
        navigateTo(GroupEmailPath);
        wait(1);
        click(StudentsChBox);
        click(AdultsChBox);
        click(ChaperoneChBox);
        click(OnlyChapeChBox);
        timestamp1 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp1);
        click(AddressesTab);
        wait(1);
        timestamp2 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp2);
        click(ComposeTab);
        wait(1);
        click(PlainTextBtn);
        click(BrowseBtn);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp1+".png");
        click(PlusBtn1);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp2+".png");
        type(CCmails,CCTxt);
        selectFromDropdown(SendDrp,"Later");
        wait(1);
        clear(ScheduleDate);
        type(getTomorrowDate(),ScheduleDate);
        selectFromDropdown(ScheduleTimeDrp,"Between Noon and 6 PM");
        wait(1);
        type("Automated test, Only Chaperones Scheduled between Noon and 6PM",SubjectTxt);
        type("This mail should include 3 images to show how the options were set up",BodyMailTxt);
        click(BodyMailTxt);
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
        waitUntilAppears(10,ConfirmEmailSent2);
        assertEquals("Success!",getText(ConfirmEmailSent2));
        wait(3);
    }

    public void OnlyChaperonesLater6PMMidnight() throws InterruptedException, AWTException {
        navigateTo(GroupEmailPath);
        wait(1);
        click(StudentsChBox);
        click(AdultsChBox);
        click(ChaperoneChBox);
        click(OnlyChapeChBox);
        timestamp1 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp1);
        click(AddressesTab);
        wait(1);
        timestamp2 = dateAndTime();
        takeScreenshot("C:\\gecko\\screenshots\\"+timestamp2);
        click(ComposeTab);
        wait(1);
        click(PlainTextBtn);
        click(BrowseBtn);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp1+".png");
        click(PlusBtn1);
        typeInKeyboard("C:\\gecko\\screenshots\\"+timestamp2+".png");
        type(CCmails,CCTxt);
        selectFromDropdown(SendDrp,"Later");
        wait(1);
        clear(ScheduleDate);
        type(getTomorrowDate(),ScheduleDate);
        selectFromDropdown(ScheduleTimeDrp,"Between 6 PM and Midnight");
        wait(1);
        type("Automated test, Only Chaperones Scheduled between 6 PM and Midnight",SubjectTxt);
        type("This mail should include 3 images to show how the options were set up",BodyMailTxt);
        click(BodyMailTxt);
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
        waitUntilAppears(10,ConfirmEmailSent2);
        assertEquals("Success!",getText(ConfirmEmailSent2));
        wait(3);
    }
}
