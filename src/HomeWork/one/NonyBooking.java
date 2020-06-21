package HomeWork.one;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class NonyBooking {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.booking.com/");
		
		driver.findElement(By.id("current_account")).click();
		driver.findElementById("username").sendKeys("test@mail.ru");
		driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.cssSelector("#password"));
	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password"))).sendKeys("21355jfgf");

		//driver.findElementById("password").sendKeys("21355jfgf");
		
		driver.findElementByXPath("//button[@class='bui-button bui-button--large bui-button--wide']").click();
	}
}
