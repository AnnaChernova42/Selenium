package Cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mailLoin {

WebDriver dr;
@Given("^navigate to gmail page$")
public void navigate(){
       dr=new FirefoxDriver();
       dr.get("http://www.gmail.com");         
       }
@When ("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")
public void login(String username,String password){
       dr.findElement(By.xpath("//*[@id='Email']")).sendKeys(username);
       dr.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(password);
       dr.findElement(By.xpath("//*[@id='signIn']")).click();
       dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       }
@Then("^home page should be displayed$")
public void verifySuccessful(){
      String expectedText="Gmail";
      String actualText=         dr.findElement(By.xpath("//*[@id='gbq1']/div/a/span")).getText();
      Assert.assertTrue("Login not successful",expectedText.equals(actualText));
      }
}

}
