package main.seven;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Headless {
	
    @Test
    public void HeadlessChrome(){
    	System.setProperty("webdriver.chrome.driver", ".//chromedriver83.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        WebElement el = driver.findElement(By.name("q"));
        el.sendKeys("Selenium Java");
        el.sendKeys(Keys.ENTER);
    }
}
