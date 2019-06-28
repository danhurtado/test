package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.Base;

import static org.junit.Assert.assertTrue;

public class NewInventoryPage extends Base {

    By Description = By.name("descrip");
    By Brand = By.name("brand");
    By IDNumber = By.name("itemno");
    By EnterNewItemBtn = By.name("form1");
    By ConfirmRegistration = By.xpath("//div[@class=\"alert alert-success\"]");

    String NEWINVENTORYPAGE = "http://qa.charmsofficetest.com/charms_qa/enterinventory.asp";

    public NewInventoryPage(WebDriver driver) { super(driver); }

    public void AddNewItem() throws InterruptedException {
        navigateTo(NEWINVENTORYPAGE);
        wait(1);
        type("Description example "+randomInteger(),Description);
        type("Brand example "+randomInteger(),Brand);
        type("ID"+randomInteger(),IDNumber);
        submit(EnterNewItemBtn);
        wait(1);
        assertTrue(isDisplayed(ConfirmRegistration4));

    }
}
