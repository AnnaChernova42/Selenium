package main.four;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "./chromedriver75.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.navigate().to("https://www.facebook.com");
		// - ������ � select - ���������. ����� ���������� ���������� - ���. Infant ������ ���������

    	//���������� ������ static
    			Select dropdown = new Select(driver.findElement(By.id("day")));
    			dropdown.selectByIndex(3);
    			dropdown.selectByValue("12");
    			dropdown.selectByVisibleText("����");
    			// ��������� �������� �� �������� �� ���������
    			// �������� ����� ������ ��� �������� �� value
    			// �������� ����� ��� �������� ������ �� ������ ������� ������
    		//	dropdown.deselectAll();   // ��� �� �������� 
    			
    	// ������� ���������		
    			driver.navigate().to("https://www.booking.com/");
    			driver.findElement(By.id("xp__guests__toggle")).click();
    			driver.findElement(By.xpath("//span[@class='bui-button__text']")).click();
    			int i=1;
    			String str=null;
    			while(i<3) {
    				driver.findElement(By.xpath("//div[contains(@class,'sb-group__field sb-group-children')]//span[@class='bui-button__text'][contains(text(),'+')]")).click();
    				str="//select[@aria-label='������� ������� "+i+"']";
    				System.out.println(str);
    				dropdown = new Select(driver.findElement(By.xpath(str)));
    				dropdown.selectByValue(Integer.toString(i));
    				i++;
    			}
    			for (int j=1;j<2;j++) {
    				driver.findElement(By.xpath("//div[contains(@class,'sb-group__field sb-group__field-rooms')]//span[@class='bui-button__text'][contains(text(),'+')]")).click();
    			}
    			
    			// Dynamic	- �������� ������������ ������ ����� ������ ����������� ��������
	}

}
