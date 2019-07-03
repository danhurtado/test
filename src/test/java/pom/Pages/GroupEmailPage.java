package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom.Base;

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


    String GROUPEMAILPAGE = "http://qa.charmsofficetest.com/charms_qa/groupemail.asp";

    public GroupEmailPage(WebDriver driver) { super(driver); }

    public void OnlyChaperones() throws InterruptedException {
        navigateTo(GROUPEMAILPAGE);
        wait(1);
        click(StudentsChBox);
        click(AdultsChBox);
        click(ChaperoneChBox);
        click(OnlyChapeChBox);
        wait(1);
        click(AddressesTab);
        click(ComposeTab);
        wait(1);
        click(BrowseBtn);
        //type("");  https://stackoverflow.com/questions/11256732/how-to-handle-windows-file-upload-using-selenium-webdriver


        /*selectFromDropdown(CategoryDrp,"Shirt");
        wait(1);
        type("ID"+randomInteger(),ItemNumber);
        type("Size: "+randomInteger(),Size);
        type("Color: "+randomInteger(),Color);
        click(EnterNewItemBtn);
        wait(1);
        assertEquals("Success!",getText(ConfirmRegistration));
        System.out.println(getText(ConfirmRegistration));
        */


    }
}
