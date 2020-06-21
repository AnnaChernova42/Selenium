package ClassWork.two;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nony {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://cosmocode.io/automation-practice/");

		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Екатерина");
		driver.findElement(By.xpath("//input[@class='lastname']")).sendKeys("Нони");
		driver.findElement(By.xpath("//input[@name='gender']")).click();
		driver.findElement(By.xpath("//input[@name='language_java']")).click();
		driver.findElement(By.xpath("//input[@name='language_c#']")).click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='age']"));

		Select select = new Select(dropdown);
		select.selectByVisibleText("Under 30");

		driver.findElement(By.xpath("//a[contains(text(),'Click Me to get Alert')]")).click();

		Thread.sleep(3000);
		String Text = driver.switchTo().alert().getText();
		System.out.println(Text);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//a[contains(text(),'Click Me to open New Window')]")).click();
	}
}