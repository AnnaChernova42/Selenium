package main.seven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation {

	public static void main(WebDriver driver, WebElement Element, String args) {

		String title = driver.getTitle();
		if (title.contentEquals("Facebook")) System.out.print("Pass");
		Element.getText();
		Element.getAttribute(args);
		Element.isEnabled();
		Element.isDisplayed();
		Element.isSelected();	

	}

}
