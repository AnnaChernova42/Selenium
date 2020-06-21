package Sites;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class 		FacebookLogin {
	public static void main(String[] args) {
		FacebookLogin obj = new FacebookLogin();
		obj.loginBrowser();
	}

	public void loginBrowser() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("dclind@mail.ru");
		driver.findElement(By.name("pass")).sendKeys("vfr4bgt5");
		driver.findElement(By.id("loginbutton")).click();
	}
}
