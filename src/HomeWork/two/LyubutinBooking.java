package HomeWork.two;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LyubutinBooking {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.booking.com");
		driver.findElement(By.xpath("//li[@id='current_account']//div[1]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mail@mail.com");
		driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("mail");
		driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
		Thread.sleep(3000);

		driver.close();

	}
} 	