package HomeWork.two;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Vityaev {

	public static String departure = "Ташкент";
	public static String pass = "1234567890";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.facebook.com/");
		 * System.out.println("title = "+driver.getTitle()); driver.getPageSource();
		 * System.out.println(driver.getCurrentUrl());
		 * driver.get("https://www.facebook");
		 * System.out.println("title = "+driver.getTitle()); driver.getPageSource();
		 * System.out.println(driver.getCurrentUrl()); String testUrl = new String
		 * (driver.getCurrentUrl()); boolean checkStr;
		 * checkStr=testUrl.equals("https://www.facebook.com/");
		 * System.out.println(checkStr); //
		 * 
		 * driver.manage().window().maximize(); Thread.sleep(3000);
		 * driver.manage().window().setSize(new Dimension(1000, 1000));
		 * driver.get("https://www.facebook.com/"); WebElement element1=
		 * driver.findElement(By.id("email")); element1.click();
		 * element1.sendKeys(email); WebElement element2=
		 * driver.findElement(By.id("pass")); element2.click(); element2.sendKeys(pass);
		 */
		driver.get("https://www.aviasales.ru/");
		WebElement element1 = driver.findElement(By.xpath("//input[@id='destination']"));
		element1.sendKeys(departure);
		Thread.sleep(1000);
	/*	WebElement element2 = driver.findElement(By.xpath("//button[@class='calendar-navbar__button --next']"));
		element2.click();
		WebElement element3 = driver.findElement(By.xpath("//button[@class='calendar-navbar__button --next']"));
		element3.click();
		Thread.sleep(1000);
	*/	System.out.println("выбор даты");
		WebElement element4 = driver.findElement(
				By.xpath("//div[@class='calendar__months']//div[2]//div[3]//div[3]//div[7]//div[1]//div[1]//div[1]"));
		element4.click();
		Thread.sleep(1000);
		WebElement element5 = driver.findElement(By.xpath(
				"//button[@class='_button_17y9b_38 _primaryOutline_17y9b_80 _medium_17y9b_133 trip-duration__cancel-departure']//span[@class='_text_17y9b_58']"));
		element5.click();
		Thread.sleep(1000);
		WebElement element6 = driver.findElement(By.xpath("//div[@class='additional-fields --avia']"));
		element6.click();
		Thread.sleep(1000);
		WebElement element7 = driver.findElement(By.xpath(
				"//div[@class='additional-fields__passengers-wrap']//div[1]//div[2]//div[2]//a[1]//*[local-name()='svg']//*[name()='path' and contains(@d,'M5 3h3v2H5')]"));
		element7.click();
		Thread.sleep(1000);
		WebElement element8 = driver.findElement(By.cssSelector(
				"body.page__body.page--avia:nth-child(2) div.header.--blue:nth-child(2) div.header__form.--solo-header.--main-page-form.--show-form-header div.aviasales-app div.aviasales-app__page-header-wrap div.page_header div.page_header-header div.page_header-form-set div.page_header-form div.forms-resolver div.forms-resolver__forms-wrap form.avia-form.--home div.avia-form__field.--passengers:nth-child(4) div._container_1phih_79.additional-fields__dropdown-container div._dropdown_1phih_82._bottomLeft_1phih_155._hideArrow_1phih_173 div._content_1phih_94.additional-fields__dropdown-inner.--avia div.additional-fields__inner-wrap div.additional-fields__passengers-wrap div.additional-fields__passenger-row:nth-child(2) div.additional-fields__passenger-control-wrap div:nth-child(3) a.additional-fields__passenger-control.--increment > svg:nth-child(1)"));
		element8.click();
		Thread.sleep(1000);
		WebElement element9 = driver.findElement(By.cssSelector(
				"body.page__body.page--avia:nth-child(2) div.header.--blue:nth-child(2) div.header__form.--solo-header.--main-page-form.--show-form-header div.aviasales-app div.aviasales-app__page-header-wrap div.page_header div.page_header-header div.page_header-form-set div.page_header-form div.forms-resolver div.forms-resolver__forms-wrap form.avia-form.--home div.avia-form__field.--passengers:nth-child(4) div._container_1phih_79.additional-fields__dropdown-container div._dropdown_1phih_82._bottomLeft_1phih_155._hideArrow_1phih_173 div._content_1phih_94.additional-fields__dropdown-inner.--avia div.additional-fields__inner-wrap div.additional-fields__trip-class div:nth-child(2) > label.custom-radio.--additional-fields.--premiumeconomy"));
		element9.click();
		Thread.sleep(1000);
		WebElement element10 = driver.findElement(By.xpath("//span[@class='_text_17y9b_58']"));
		element10.click();
		Thread.sleep(20000);
		WebElement element11 = driver.findElement(By.cssSelector(
				"body.page__body.page--avia.is-calendar-matrix.--oneway.--hide-header.is-sticky-header.--hide-multiway:nth-child(2) div.header.--blue:nth-child(2) div.header__form.--solo-header.--show-form-header div.aviasales-app div.aviasales-app__page-header-wrap div.page_header div.page_header-header.--compact div.page_header-form-set div.page_header-form div.forms-resolver div.forms-resolver__forms-wrap form.avia-form div.avia-form__field.--passengers:nth-child(4) div._container_1phih_79.additional-fields__dropdown-container div.additional-fields.--is-opened.--avia > div.additional-fields__label.--is-gray:nth-child(3)"));
		element11.click();
		Thread.sleep(1000);
		WebElement element12 = driver.findElement(By.xpath(
				"//body[contains(@class,'page__body page--avia is-calendar-matrix --oneway --hide-header is-sticky-header --hide-multiway')]/div[contains(@class,'header --blue')]/div[contains(@class,'--show-form-header')]/div[contains(@class,'aviasales-app')]/div[contains(@class,'aviasales-app__explosion-wrap')]/div[contains(@class,'explosion')]/div/div[contains(@class,'app')]/div[contains(@class,'app__inner')]/div[contains(@class,'app__content')]/div/div[contains(@class,'product-list')]/div[2]/div[1]/button[1]"));
		element12.click();
		Thread.sleep(1000);
		WebElement element13 = driver
				.findElement(By.xpath("//label[contains(@class,'custom-radio --additional-fields --economy')]"));
		element13.click();
		Thread.sleep(1000);
		WebElement element14 = driver.findElement(By.cssSelector(
				"body.page__body.page--avia.is-calendar-hidden.is-calendar-matrix.--oneway.is-sticky-header.--hide-header.--hide-multiway:nth-child(2) div.header.--blue:nth-child(2) div.header__form.--solo-header.--show-form-header div.aviasales-app div.aviasales-app__page-header-wrap div.page_header div.page_header-header.--compact div.page_header-form-set div.page_header-form div.forms-resolver div.forms-resolver__forms-wrap form.avia-form div.avia-form__submit:nth-child(5) div.avia-form-submit button._button_17y9b_38._primary_17y9b_70.form-submit.--on-page > span._text_17y9b_58"));
		element14.click();
		Thread.sleep(20000);
		WebElement element15 = driver.findElement(By.xpath(
				"//body[contains(@class,'page__body page--avia is-calendar-matrix --oneway --hide-header is-sticky-header --hide-multiway')]/div[contains(@class,'header --blue')]/div[contains(@class,'--show-form-header')]/div[contains(@class,'aviasales-app')]/div[contains(@class,'aviasales-app__explosion-wrap')]/div[contains(@class,'explosion')]/div/div[contains(@class,'app')]/div[contains(@class,'app__inner')]/div[contains(@class,'app__content')]/div/div[contains(@class,'product-list')]/div[2]/div[1]/button[1]"));
		element15.click();
		Thread.sleep(1000);
		WebElement element16 = driver.findElement(By.className("ticket-flight__title"));
		element16.click();
		element16.getText();
	}
}
