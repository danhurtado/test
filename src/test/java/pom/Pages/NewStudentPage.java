package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.Base;
import pom.Config;
import pom.Settings;

import static org.junit.Assert.assertEquals;

public class NewStudentPage extends Base {

    By SuggestIDBtnLocator = By.id("suggest-id");
    By SuggestedStudentID = By.id("student-id");
    By FirstNameLocator = By.id("student-fname");
    By MiddleNameLocator = By.id("student-mname");
    By LastNameLocator = By.id("student-lname");
    By BtnAddStudent = By.xpath("//*[@id=\"main\"]/div/form/div/div[2]/div[2]/button");
    By AssignedStudentID = By.xpath("//*[@id=\"main\"]/div/div[3]/div[2]/div/div/div/span[1]/strong");

    Config config = new Config(Settings.ENVIRONMENT);
    String ADDNEWSTUDENTPAGE = config.url+"/addnewstudent.asp";

    public NewStudentPage(WebDriver driver) { super(driver); }

    public void AddNewStudent() throws InterruptedException {
        navigateTo(ADDNEWSTUDENTPAGE);
        wait(1);
        click(SuggestIDBtnLocator);
        String IDsuggested = getTextFromTextBox(SuggestedStudentID);
        System.out.println(IDsuggested);
        type("Dan"+IDsuggested,FirstNameLocator);
        type("Middle"+IDsuggested,MiddleNameLocator);
        type("Last"+IDsuggested,LastNameLocator);
        click(BtnAddStudent);
        wait(1);
        String IDassigned = getConfirmationIDFromAddNewStudentPage(AssignedStudentID);
        System.out.println(IDassigned);

        assertEquals(IDsuggested,IDassigned);

    }
}
