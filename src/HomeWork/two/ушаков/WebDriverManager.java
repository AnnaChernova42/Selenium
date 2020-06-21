package HomeWork.two.������;
import com.beust.jcommander.internal.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class WebDriverManager {

    public static ChromeDriver ChromeDriverInit(String url, ChromeOptions options){
        System.setProperty("webdriver.chrome.driver","libs\\chromedriver.exe");
        ChromeDriver driver;

        // TODO: надо проверить, что будет, если просто передать null
        if (options != null) {
            driver = new ChromeDriver(options);
        } else {
            driver = new ChromeDriver();
        }

        if (url != ""){
            driver.get(url);
        }

        return driver;
    }

    public static FirefoxDriver FirefoxDriverInit(String url, @Nullable FirefoxOptions options){

        System.setProperty("webdriver.gecko.driver","libs\\geckodriver.exe");
        FirefoxDriver driver;
        // TODO: надо проверить, что будет, если просто передать null
        if (options != null) {
            driver = new FirefoxDriver(options);
        } else {
            driver = new FirefoxDriver();
        }

        if (url != ""){
            driver.get(url);
        }

        return driver;
    }

    public static void EndProgramm(RemoteWebDriver driver) {
        ChromeDriver chd = (ChromeDriver) driver;
        if (!driver.equals(null)) {
            // использую этот метод, т.к. он закрывает все вкладки, в отличие от close
            driver.quit();
        }
        // завершаю выполнение программы, чтобы не происходило ошибок с обращением к несуществующей сессии (костыль)
        //System.exit(0);
    }
}
