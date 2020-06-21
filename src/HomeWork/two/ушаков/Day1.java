package HomeWork.two.������;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.rmi.Remote;

public class Day1 {

    RemoteWebDriver driver;

    public void launch() throws InterruptedException {
        StartFirstExercise();
        StartSecondExercise();
    }

    private void StartFirstExercise() throws InterruptedException {

        WebElement emailInput;
        WebElement passInput;
        WebElement loginButton;

        driver = WebDriverManager.ChromeDriverInit("https://www.facebook.com/", null);

        String pageTitle = driver.getTitle();
        System.out.println("Current page is now \"" + pageTitle + "\"");

        if (!pageTitle.toLowerCase().contains("facebook")) {
            System.out.println("Не та страница!");
            WebDriverManager.EndProgramm(driver);
        } else {
            emailInput = driver.findElementByXPath("//input[@id='email']");
            passInput = driver.findElementByXPath("//input[@id='pass']");
            loginButton = driver.findElementByXPath("//label[@id='loginbutton']");

            // немножко подождем для сурьёзности ^_^
            WebDriverWait driverWait = new WebDriverWait(driver, 30);
            driverWait.until(ExpectedConditions.elementToBeClickable(loginButton));
//            driverWait.until(ExpectedConditions.visibilityOfAllElements(loginButton));
//            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pass"))).sendKeys("21355jfgf");

            emailInput.clear();
            emailInput.sendKeys("SeleniumTester");
            passInput.clear();
            passInput.sendKeys("SuperStrongPassword");
            loginButton.click();
        }

        Thread.sleep(3000);

        WebDriverManager.EndProgramm(driver);
    }

    private void StartSecondExercise() throws InterruptedException {
        WebElement emailInput;
        WebElement passwdInput;
        WebElement loginButton;

        //принцип с опциями понятен, не стал добавлять другие
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        driver = WebDriverManager.FirefoxDriverInit("https://www.booking.com/", options);
        WebDriverWait driverWait = new WebDriverWait(driver, 15);

        loginButton = driver.findElementByXPath("//li[@id='current_account']");
        loginButton.click();
        //TODO: убрать, как только будет добавлен wait
        Thread.sleep(1000);
        emailInput = driver.findElementByXPath("//input[@id='username']");
        emailInput.sendKeys("wazzapsjobs@gmail.com");
        emailInput.submit();
        Thread.sleep(1000);
        //TODO: не сработало, надо отладить
        //driverWait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//input[@id='password']")));
        passwdInput = driver.findElementByXPath("//input[@id='password']");
        passwdInput.sendKeys("GHB1356klmOPS");
        passwdInput.submit();
        Thread.sleep(1000);
        WebElement currentAccount = driver.findElementByXPath("//li[@id='current_account']");
        Thread.sleep(1000);

        WebDriverManager.EndProgramm(driver);
    }
}
