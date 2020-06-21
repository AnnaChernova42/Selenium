package main.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBy {

	public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        System.out.println("Launched the chrome browser with the given url");
        driver.manage().window().maximize();
        //заполн€ем им€/почту
        driver.findElement(By.name("email")).sendKeys("xxx@gmail.com");
        // заполн€ем пароль
        driver.findElement(By.name("pass")).sendKeys("xxxxxx");
        //нажимаем ¬ойти
        driver.findElement(By.id("u_0_q")).click();
        //login
		driver.close();

		
		/*
		driver.findElement(By.id("search-inp"));
		driver.findElement(By.name("user_v1[query]"));
		driver.findElement(By.className("search_inp collapse giTrackElementHeader"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.cssSelector(".search_inp.collapse.giTrackElementHeader"));
		driver.findElement(By.xpath("//input[@id=search-inp]"));
		driver.findElement(By.linkText("javascript:void(0);"));
		driver.findElement(By.partialLinkText("void(0)"));
		 */

	}

}
