package Sites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Booking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.booking.com/");
		
		//авторизация
		driver.findElement(By.id("current_account")).click();
		driver.findElementById("username").sendKeys("test@mail.ru");
		driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.cssSelector("#password"));
	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password"))).sendKeys("21355jfgf");

		//driver.findElementById("password").sendKeys("21355jfgf");
		
		driver.findElementByXPath("//button[@class='bui-button bui-button--large bui-button--wide']").click();
		
		
		//закыли вслывашку с логином и куки
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='bicon bicon-aclose header-signin-prompt__close']")));
		driver.findElement(By.xpath("//div[@class='bicon bicon-aclose header-signin-prompt__close']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//button[@class='bui-button bui-button--primary bui-button--wide close_warning']//span[@class='bui-button__text']")));
		driver.findElement(By.xpath(
				"//button[@class='bui-button bui-button--primary bui-button--wide close_warning']//span[@class='bui-button__text']"))
				.click();
		
    	System.out.println(driver.getWindowHandle());
		
		//клик Отели
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//div[1]//div[2]//h3[1]//a[1]")));
	//	driver.findElement(By.xpath("//li[1]//div[1]//div[2]//h3[1]//a[1]")).click();
    	System.out.println("клик Отели");
    	WebElement otel = driver.findElement(By.linkText("Отели"));
		wait.until(ExpectedConditions.visibilityOf(otel));
		otel.click();
		

		Object[] a = driver.getWindowHandles().toArray();
		System.out.println("Все окна: "+a.toString());
		driver.switchTo().window(a[1].toString());		
		System.out.println("текущее окно : "+driver.getWindowHandle());
		
		System.out.println("Calendar");
		By date = By.xpath("//td[contains(@data-date,'2020-06-08')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(date));
		driver.findElement(date).click();
		
		By NextMon = By.xpath("//div[contains(@class,'bui-calendar__control bui-calendar__control--next')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(NextMon));
		driver.findElement(NextMon).click();
		
		try {
			driver.findElement(By.xpath("//td[contains(@data-date,'2020-08-08')]")).click();

		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			System.out.println("Calendar2attempt");
			driver.findElement(By.xpath("//td[contains(@data-date,'2020-08-08')]")).click();
		}

		
		System.out.println("куда");
		By Place = By.xpath("//input[@id='ss']");
	//	WebElement Place= driver.findElement();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Place));
		driver.findElement(Place).sendKeys("Кипр");
		
//		WebElement CalendarIn = driver.findElement(By.xpath("//div[contains(@class,'xp-calendar')]//div[2]//table[1]//tbody[1]//tr[1]//td[1]"));
		
		
		
		System.out.println("количество");
		By Num = By.xpath("//label[@id='xp__guests__toggle']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Num));
		driver.findElement(Num).click();
		
		By NumAdultP = By.xpath("//div[contains(@class,'sb-group__field sb-group__field-adults')]//button[contains(@class,'bui-button bui-button--secondary bui-stepper__add-button')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(NumAdultP));
		driver.findElement(NumAdultP).click();

		By NumAdultM = By.xpath("//div[contains(@class,'sb-group__field sb-group__field-adults')]//button[contains(@class,'bui-button bui-button--secondary bui-stepper__subtract-button')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(NumAdultM));
		driver.findElement(NumAdultM).click();
		
		driver.findElement(Num).click();
		
		System.out.println("price");
		By price = By.xpath("//div[contains(@class,'xp__button')]//span[1]");
		driver.findElement(price).click();
		
		
		By error = By.xpath("//div[contains(@class,'fe_banner__message')][contains(text(),'30')]");
		System.out.println(driver.findElement(error).getText().toString());
	
		driver.findElement(error).getText().equals("К сожалению, бронирование более чем на 30 ночей невозможно.");
	
		
	}
}
