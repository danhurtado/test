package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pom.Base;

import static org.junit.Assert.assertEquals;

public class NewUniformPage extends Base {

    By ItemNumber = By.name("item_number");
    By Size = By.name("size");
    By Color = By.name("color");
    By EnterNewItemBtn = By.xpath("//*[@id=\"item-form\"]/div/div[2]/div[8]/div/div/div/button");
    By ConfirmRegistration = By.xpath("//*[@id=\"growls\"]/div/div[2]");
    By CategoryDrp = By.id("select-category");

    String NEWUNIFORMPAGE = "http://qa.charmsofficetest.com/charms_qa/enteruniform.asp";

    public NewUniformPage(WebDriver driver) { super(driver); }

    public void AddNewUniform() throws InterruptedException {
        navigateTo(NEWUNIFORMPAGE);
        wait(1);
        selectFromDropdown(CategoryDrp,"Shirt");
        wait(1);
        type("ID"+randomInteger(),ItemNumber);
        type("Size: "+randomInteger(),Size);
        type("Color: "+randomInteger(),Color);
        click(EnterNewItemBtn);
        wait(1);
        assertEquals("Success!",getText(ConfirmRegistration));
        System.out.println(getText(ConfirmRegistration));

    }
}
