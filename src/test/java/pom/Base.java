package pom;

//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.datatransfer.StringSelection;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver geckoDriver(){
        System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver edgeDriver(){

        System.setProperty("webdriver.edge.driver", "C:/gecko/MicrosoftWebDriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:/gecko/msedgedriver.exe"); //msedge
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public void closeConection(){
        if(Settings.CLOSECONECTION == true)
            driver.quit();
    }

    public WebDriver Browser(String brow){
        if(brow=="Firefox"){
            return geckoDriver();
        } if (brow=="Chrome"){
            return chromeDriver();
        }if (brow=="EDGE"){
            return edgeDriver();
        } else
            return geckoDriver();
    }

    public void selectFromDropdown(By locator, String text){
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByVisibleText(text);
    }

    public void selectFromDropdownByIndex(By locator, int index){
        Select dropdown = new Select(driver.findElement(locator));
        //dropdown.selectByVisibleText(text);
        dropdown.selectByIndex(index);
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

    public void clear(By locator){
        driver.findElement(locator).clear();
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
    public void waitInMilliseconds(int milliseconds) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(milliseconds);
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

    public void typeInKeyboard2(String string) throws AWTException, InterruptedException {
        wait(1);
        StringSelection s = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Robot robot = new Robot();
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
        robot.keyPress(java.awt.event.KeyEvent.VK_V);
        robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
        wait(1);
    }

    public void typeEnter() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        wait(1);
    }


    public void typeInKeyboard(String string) throws AWTException, InterruptedException {
        waitInMilliseconds(1500);
        StringSelection s = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Robot robot = new Robot();
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
        robot.keyPress(java.awt.event.KeyEvent.VK_V);
        robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
        //Thread.sleep(3000);
        wait(1);
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        wait(1);
    }

    public void scrollToElement(By locator) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
        wait(1);
    }

    /*public void takeScreenshot(){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\gecko\\1.png"));
    }*/

    public void takeScreenshot(String path){
        try{
            wait(1);
            //String timestamp = dateAndTime();
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(image, "png", new File(path+".png"));
            }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public String dateAndTime(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("M-dd-yyyy hh:mm:ss");
        //formatter.
        String strDate = formatter.format(date);
        strDate = strDate.replace(':', '.');
        return strDate;
    }

    public String getTomorrowDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        String result;
        result = sdf.format(calendar.getTime());
        //System.out.print(result);
        return result;
    }

    public void waitUntilAppears(int maxTime, By locator){
        WebDriverWait wait = new WebDriverWait(driver, maxTime);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String left(String string, int length){
            return string.substring(0,length);
    }

    public String right(String string,int largo){
        return  string.substring(string.length()-largo, string.length());
    }
}
