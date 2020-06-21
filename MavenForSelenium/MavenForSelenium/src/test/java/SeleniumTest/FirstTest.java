package SeleniumTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException, IOException {
		WebElement prof14 = driver.findElement(By.xpath("//input[@id='si_popup_email']"));
		prof14.sendKeys("dclind@mail.ru");
		WebElement prof24 = driver.findElement(By.xpath("//input[@id='si_popup_passwd']"));
		prof24.sendKeys("dclind@13");
		WebElement prof110 = driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']"));
		prof110.click();
		TimeUnit.SECONDS.sleep(25);
		WebElement prof = driver.findElement(By.xpath("//span[@class='webinar-profile-name']"));
		prof.click();
		WebElement prof2 = driver.findElement(By.xpath("//a[@data-button-name='My Profile']"));
		prof2.click();
		TimeUnit.SECONDS.sleep(10);
		WebElement prof3 = driver.findElement(By.xpath("//i[@class='icon-pr-edit'][1]"));
		prof3.click();
		TimeUnit.SECONDS.sleep(10);
		driver.findElement(By.xpath("//i[@class='icon-camera']")).click();
		//Click button "choose file"
		driver.findElement(By.xpath("//input[@id='custom-input']")).click();
		Runtime.getRuntime().exec("./loadPic.exe");
		//Upload button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

  }
  @BeforeTest
  public void beforeTest() {
	    System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.navigate().to("https://edureka.co");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
