package HomeWork.one;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Vitjaev {
	
public static String email="mihailvityaev@inbox.ru";
public static String pass="1234567890";
public static void main (String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",".//chromedriver83.exe");
ChromeDriver driver = new ChromeDriver();
/*
driver.get("https://www.facebook.com/");
System.out.println("title = "+driver.getTitle());
driver.getPageSource();
System.out.println(driver.getCurrentUrl());
driver.get("https://www.facebook");
System.out.println("title = "+driver.getTitle());
driver.getPageSource();
System.out.println(driver.getCurrentUrl());
String testUrl = new String (driver.getCurrentUrl());
boolean checkStr;
checkStr=testUrl.equals("https://www.facebook.com/");
System.out.println(checkStr);
//

driver.manage().window().maximize();
Thread.sleep(3000);
driver.manage().window().setSize(new Dimension(1000, 1000));
driver.get("https://www.facebook.com/");
WebElement element1= driver.findElement(By.id("email")); 
element1.click();
element1.sendKeys(email);
WebElement element2= driver.findElement(By.id("pass")); 
element2.click();
element2.sendKeys(pass);
*/
driver.get("https://www.booking.com/");
WebElement element3= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/div[1]/span[1]")); 
element3.click();
//WebElement element4= driver.findElement(By.xpath("//a[@id='b_tt_holder_1']//span")); 
//element4.click();
WebElement element5= driver.findElement(By.cssSelector("#username")); 
element5.click();
element5.sendKeys(email);
element5.sendKeys(Keys.ENTER);
Thread.sleep(1000);
WebElement element6= driver.findElement(By.id("password")); 
element6.click();
element6.sendKeys(pass);
element6.sendKeys(Keys.ENTER);
WebElement element7= driver.findElement(By.className("bui-button__text")); 
element7.click();
Thread.sleep(1000);
WebElement element8= driver.findElement(By.xpath("//span[contains(@class,'header_name user_firstname ge-no-yellow-bg')]")); 
element8.click();
Thread.sleep(1000);
WebElement element9= driver.findElement(By.xpath("//a[contains(text(),'My dashboard')]"));
element9.click();
WebElement element10= driver.findElement(By.xpath("//div[@class='acc-profile-card__user-name']"));
element10.getTagName();
System.out.println("PageSource = "+driver.getPageSource());
driver.getPageSource();
driver.close();
/*
WebElement element6= driver.findElement(By.className("bui-button__text")); 
element6.click();
WebElement element7= driver.findElement(By.linkText("create an account"));
element7.click();

WebElement element3= driver.findElement(By.id("u_0_b")); 
element3.click();
String text = element.getText();
//input[@id='pass']
//input[@id='pass']
WebElement header = driver.findElement(By.id("header"));
header.findElement(By.cssSelector("#pass")).click();
//input[@id='email']
String Email="mihailvityaev@inbox.ru"; 
WebElement element_enter = driver.findElement(By.xpath("//*[@id='email']")); 
element_enter.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).sendKeys("email"); 
driver.findElement(By.className("inputtext login_form_input_box")).click();
inputtext login_form_input_box
String login="0000000047166";
WebElement element_enter = driver.findElement(By.className("inputtext login_form_input_box")); 
element_enter.findElement(By.className("inputtext login_form_input_box")).sendKeys("login"); 
driver.navigate().to("https://stackoverflow.com/questions/13635563/setting-jdk-in-eclipse");
driver.navigate().refresh();
driver.navigate().back();
driver.navigate().forward();
driver.close() ;
*/
}
}
