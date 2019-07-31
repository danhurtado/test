package WEBSTORE.Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UIOperation {
    WebDriver driver;
    public UIOperation(WebDriver driver){
        this.driver = driver;
    }
    public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
        //System.out.println("");
        switch (operation.toUpperCase()) {
            case "CLICK":
                //Perform click
                driver.findElement(this.getObject(p,objectName,objectType)).click();
                break;
            case "SETTEXT":
                //Set text on control
                //System.out.println("Hola");
                driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
                break;

            case "GOTOURL":
                //Get url of application
                driver.get(p.getProperty(value));
                break;
            case "GETTEXT":
                //Get text of an element
                driver.findElement(this.getObject(p,objectName,objectType)).getText();
                break;
            case "NAVIGATETO":
                driver.navigate().to(p.getProperty(value));
                break;
            case "SUBMIT":
                driver.findElement(this.getObject(p,objectName,objectType)).submit();
                break;
            case "WAIT":
                TimeUnit.MILLISECONDS.sleep(Integer.parseInt(p.getProperty(value)));
                break;
            case "TYPERANDOM":
                Random rand = new Random();
                int n = rand.nextInt(100000);
                driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(Integer.toString(n));
                break;
            case "WAITUNTILVISIBLE":
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOfElementLocated(this.getObject(p,objectName,objectType)));
                break;
            /*case "DOLINE":
                String temp = p.getProperty(value);
                perform(p,operation,objectName,objectType,value);
                break;*/
            default:
                break;
        }
    }

    public boolean validate(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
        if(driver.findElement(this.getObject(p,objectName,objectType)).getText() == p.getProperty(value)){
            return true;
        }
        return false;
    }

    /**
     * Find element BY using object type and value
     * @param p
     * @param objectName
     * @param objectType
     * @return
     * @throws Exception
     */
    private By getObject(Properties p,String objectName,String objectType) throws Exception{
        //Find by xpath
        if(objectType.equalsIgnoreCase("XPATH")){

            return By.xpath(p.getProperty(objectName));
        }
        else if(objectType.equalsIgnoreCase("ID")){

            return By.id(p.getProperty(objectName));

        }
        //find by class
        else if(objectType.equalsIgnoreCase("CLASSNAME")){

            return By.className(p.getProperty(objectName));

        }
        //find by name
        else if(objectType.equalsIgnoreCase("NAME")){

            return By.name(p.getProperty(objectName));

        }
        //Find by css
        else if(objectType.equalsIgnoreCase("CSS")){

            return By.cssSelector(p.getProperty(objectName));

        }
        //find by link
        else if(objectType.equalsIgnoreCase("LINK")){

            return By.linkText(p.getProperty(objectName));

        }
        //find by partial link
        else if(objectType.equalsIgnoreCase("PARTIALLINK")){

            return By.partialLinkText(p.getProperty(objectName));

        }else
        {
            throw new Exception("Wrong object type");
        }
    }
}
