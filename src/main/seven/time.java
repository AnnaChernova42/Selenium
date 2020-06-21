package main.seven;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class time {
	
	@Test
	public void testLogin() {
		System.setProperty("webdriver.gecko.driver", ".//drivers//FFdriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.get("http://gmail.com");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    // ��������� �������� ��������
	    long loadEventEnd = (Long) js.executeScript("return window.performance.timing.loadEventEnd;");
	    // ������ ��������
	    long navigationStart = (Long) js.executeScript("return window.performance.timing.navigationStart;");
	    // ����� �������� ��������
	    System.out.println("Page Load Time is " + (loadEventEnd - navigationStart)/1000 + " seconds.");
	}

}
