package Sites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class aviasales {

	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.navigate().to("https://www.aviasales.ru/");

    	WebDriverWait wait = new WebDriverWait(driver, 10);	
    	
    	System.out.println("куда");
    	By destination = By.xpath("//input[@id='destination']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(destination));
    	driver.findElement(destination).sendKeys("Нью-Йорк");
    	
    	System.out.println("открыть календарь");
    	By openCalendar = By.xpath("//div[@class='trip-duration__input-wrapper --departure']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(openCalendar));
    	driver.findElement(openCalendar).click();
    	
    	System.out.println("переключение по календарю");
 //   	driver.findElement(By.xpath("//div[@class='trip-duration__loader is-animation-started is-animation-ended']")).click();
    	By nextMonth = By.xpath("//div[@class='calendar-navbar__tooltip-wrapper']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(nextMonth));
    	driver.findElement(nextMonth).click();

    	System.out.println("выбор даты");
    //	driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/form/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[3]/div[2]/div[4]/div[1]")).click();
    	//By dateOfShipment = By.xpath("//div[@class='calendar__day-cell bounded selected' and @aria-label='Thu Aug 06 2020']");
		driver.findElement(By.xpath("//div[@class='calendar-day__date' and text()='31']")).click();
    	
    	
    	System.out.println("обратный билет не нужен");
    	By returnTicket = By.xpath("//span[@class='_text_17y9b_58']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(returnTicket));
    	driver.findElement(returnTicket).click();
    	
    	
    	System.out.println("выбор пассажира");
    	By choicePassenger = By.xpath("//div[@class='avia-form__field --passengers']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(choicePassenger));
    	driver.findElement(choicePassenger).click();
    	
    	
    	System.out.println("2 взрослых пассажира");
    	By adultPassenger = By.xpath("//div[@class='additional-fields__passengers-wrap']//div[1]//div[2]//div[2]//a[1]");
    	wait.until(ExpectedConditions.presenceOfElementLocated(adultPassenger));
    	driver.findElement(adultPassenger).click();
    	
    	
    	System.out.println("1 детский пассажир");
    	By childPassenger = By.xpath("//div[@class='additional-fields__passengers-wrap']//div[2]//div[2]//div[2]");
    	wait.until(ExpectedConditions.presenceOfElementLocated(childPassenger));
    	driver.findElement(childPassenger).click();
    	
    	System.out.println("Комфорт");
    	By comfortTicket = By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[2]//label[1]//div[2]");
    	wait.until(ExpectedConditions.presenceOfElementLocated(comfortTicket));
    	driver.findElement(comfortTicket).click();
    	
 //   	driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/form/div/div/div/div/label[1]")).click();
    	
    	System.out.println("Найти билет");
    	By findTicket = By.xpath("//button[@class='_button_17y9b_38 _primary_17y9b_70 form-submit --on-home']");
    	wait.until(ExpectedConditions.presenceOfElementLocated(findTicket));
    	driver.findElement(findTicket).click();
    	
    	System.out.println(driver.getWindowHandle());
		Object[] a = driver.getWindowHandles().toArray();
		System.out.println(a[1].toString());
		driver.switchTo().window(a[1].toString());
    	
		WebElement flight = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'SU-122')]")));
    	//поиск первого рейса
   // 	driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/button[1]")).click();
    	
    	System.out.println(flight);
    	
   // 	driver.quit();
    	
    }

	}