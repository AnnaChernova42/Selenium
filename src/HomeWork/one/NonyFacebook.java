package HomeWork.one;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class NonyFacebook {
	
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String Url = driver.getCurrentUrl();
		
		if (Url.equals("https://www.facebook.com/")) {
			System.out.println("the url is correct");
		} else {
			System.out.println("the url is not correct");
		}

		driver.findElementById("email").sendKeys("test@mail.ru");

		driver.findElementById("pass").sendKeys("Pass1");
		driver.findElementById("u_0_b").click();
		
	}

}
