package HomeWork.one;
 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Pilugin {
    public static void main(String[] args) throws InterruptedException {
         
        System.setProperty("webdriver.chrome.driver",".//chromedriver83.exe");
        ChromeDriver driver= new ChromeDriver();
           driver.get("https://www.facebook.com/");
                   System.out.println("current url is "+driver.getCurrentUrl());
           
           String testUrl = new String (driver.getCurrentUrl());
           boolean checkStr;
           checkStr=testUrl.equals("https://www.facebook.com/");
          
           if (checkStr!=true) System.out.println("url is wrong");
                   else System.out.println ("url is correct");
           
           WebElement testLogin = driver.findElementByXPath("//input[@id='email']");
           WebElement testPassword = driver.findElementByXPath("//input[@name='pass']");
           WebElement enterButton = driver.findElementByXPath("//label[@class='login_form_login_button uiButton uiButtonConfirm']//input");
           
           testLogin.sendKeys("testlogin");
           testPassword.sendKeys("anypass");
           Thread.sleep(2000);
           enterButton.click();
           Thread.sleep(8000);
            
           driver.close();
            
        }       
}