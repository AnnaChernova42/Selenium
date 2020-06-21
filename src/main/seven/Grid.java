package main.seven;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Grid {
	String browserType = "chrome";
	
	@Test
	public void mailTestLocal() throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver83.exe");
		WebDriver driver = new  ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		driver.navigate().to("http://gmail.com");
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("username@gmail.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Далее']")));
		driver.findElement(By.xpath("//span[text()='Далее']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='headingText']")));
		System.out.println(driver.findElement(By.xpath("//*[@id='headingText']")).getText());
		driver.close();
	}

	@Test (enabled = false)
	public void mailTest() throws MalformedURLException {
		DesiredCapabilities dr = null;
		if (browserType.equals("chrome")) {
			dr = DesiredCapabilities.chrome();
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.WINDOWS); //Grid воспринимает Windows-7 как Vista
			dr.setVersion("83");

		} else {
			if (browserType.equals("firefox")) {
				dr = DesiredCapabilities.firefox();
				dr.setBrowserName("firefox");
				dr.setPlatform(Platform.WINDOWS);

			} else {
				dr = DesiredCapabilities.internetExplorer();
				dr.setBrowserName("iexplore");
				dr.setPlatform(Platform.WINDOWS);
			}
		}

		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		driver.navigate().to("http://gmail.com");
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("username@gmail.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Далее']")));
		driver.findElement(By.xpath("//span[text()='Далее']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='headingText']")));
		System.out.println(driver.findElement(By.xpath("//*[@id='headingText']")).getText());
		driver.close();
	}
}
