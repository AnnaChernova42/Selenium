package ClassWork.two;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pilugin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.navigate().to("https://cosmocode.io/automation-practice/");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Click here to reload this page')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Click here to reload this page')]")).click();
		WebElement FirstName = driver.findElementByXPath("//input[@id='firstname']");
		FirstName.sendKeys("Viktor");
		WebElement LastName = driver.findElementByXPath("//input[@class='lastname']");
		LastName.sendKeys("Piliugin");
		WebElement RadioGender = driver.findElementByXPath("//body//input[4]");
		RadioGender.click();
		WebElement Language = driver.findElementByXPath("//body//input[6]");
		Language.click();
		WebElement SelectElem = driver.findElementByXPath("//select[@name='age']");
		Select select = new Select(SelectElem);
		select.selectByIndex(4);
	}
}