package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Base {

    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriver(){
        System.setProperty("webdriver.chrome.driver", "C:/gecko/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public boolean isDisplayed(By locator){
        try{
            return driver.findElement(locator).isDisplayed();
            //String text = driver.findElement(locator).getText();
            //return text;
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public String isDisplayed1(By locator){
        if(driver.findElement(locator).isDisplayed()){
            return  driver.findElement(locator).getText();
        } else {
            return "locator not found";
        }
    }

    public void visit(String url){
        driver.get(url);
    }

    public void navigateTo(String locator){
        driver.navigate().to(locator);
    }

    public void submit(By locator){
        driver.findElement(locator).submit();
    }

    public void wait(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }
    public String getTextFromTextBox(By locator){
        return driver.findElement(locator).getAttribute("value");
    }

    public String getConfirmationIDFromAddNewStudentPage(By locator){
        return driver.findElement(locator).getText();
    }

    public int randomInteger(){
        Random rand = new Random();
        int n = rand.nextInt(100000);
        //System.out.println(n);
        return n;
    }

}
