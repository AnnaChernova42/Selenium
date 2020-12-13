import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
/*
    	// Окна	   				
     	driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Window");   	
    	Thread.sleep(3000);
    	WebElement tab = driver.findElement(By.xpath("//h1[contains(text(),'Frames And Windows')]"));
    	
    	//переместиться к заглавию (текст) окна
    	Actions action = new Actions(driver);
    	action.moveToElement(tab).perform();
    	
    	tab = driver.findElement(By.xpath("//li[@id='Open New Window']"));
    	tab.click();
    	driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][contains(text(),'Click Here')]")).click();
    	
    	//получить список всех окон
    	Thread.sleep(3000);
    	System.out.println(driver.getWindowHandle());
		Object[] a = driver.getWindowHandles().toArray();
		
		System.out.println("Все окна: ");
		for (int i=0;i<a.length;i++) {
			System.out.println("Окно " + i + ": " + a[i].toString());
		}
		
		
		driver.switchTo().window(a[1].toString());		
		System.out.println("текущее окно : "+driver.getWindowHandle());
    	
*/
		
//ОПОВЕЩЕНИЯ
		
		driver.navigate().to("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='normal-btn-warning']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='alert alert-warning alert-normal-warning']/button")).click();
		
		/*
		Alert MyAlert=driver.switchTo().alert();
		//Получить текст оповещения
				String Text = driver.switchTo().alert().getText();
				System.out.println(Text);
				*/
//Нажать OK
	//	driver.switchTo().alert().accept();
		
//Нажать Отмена
//		driver.switchTo().alert().dismiss();
		
/*
//Модальные окна 
		driver.navigate().to("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		driver.findElement(By.xpath("//body/div[@class='container-fluid text-center']/div[@class='row']/div[@class='col-md-6 text-left']/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
	//	driver.switchTo().frame(driver.findElement(By.id("myModal0")));
		driver.switchTo().activeElement();
		
		System.out.println(driver.getWindowHandles().toString());

		
//Отправить текст в поле ввода
		driver.switchTo().alert().sendKeys("test");
		
		
		
//Модальные окна 
		driver.switchTo().frame(driver.findElement(By.id("ModalId")));
		driver.switchTo().activeElement();
		
//Drag&Drop
  driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
  WebElement sum = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
  
		WebElement From=driver.findElement(By.xpath("//*[@id='forth'][2]/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));; 
		Actions action=new Actions(driver);
		Action dragdrop = action.clickAndHold(From).moveToElement(To).release(To).build();
		dragdrop.perform();
	*/    			

	}

}
