package ClassWork.two;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class question2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.booking.com/");

		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bicon bicon-aclose header-signin-prompt__close']")));
	        driver.findElement(By.xpath("//div[@class='bicon bicon-aclose header-signin-prompt__close']")).click();  
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='bui-button bui-button--primary bui-button--wide close_warning']//span[@class='bui-button__text']")));
	        driver.findElement(By.xpath("//button[@class='bui-button bui-button--primary bui-button--wide close_warning']//span[@class='bui-button__text']")).click();
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//div[1]//div[2]//h3[1]//a[1]")));
	        driver.findElement(By.xpath("//li[1]//div[1]//div[2]//h3[1]//a[1]")).click();
	        Thread.sleep(4000);    
	        Object [] array  = driver.getWindowHandles().toArray();    
	        driver.switchTo().window(array[0].toString());
	          Thread.sleep(2000);          
	          driver.switchTo().window(array[1].toString());         
	        Thread.sleep(2000);         
	        driver.close();
	}
}
