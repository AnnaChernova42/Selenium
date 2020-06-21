package main.seven;


	import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.LegacyProxyServer;
import net.lightbody.bmp.proxy.ProxyServer;

import java.io.File;

import org.junit.Test;
	import org.openqa.selenium.Proxy;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class timeHar {

	    @Test
	    public void bmpTest() throws Exception {
	        // запуск прокси сервера
	        ProxyServer server = new ProxyServer(4444);
	        server.autoBasicAuthorization("example.com", "username", "password");
	        server.start();

	        // получение Selenium proxy
	        Proxy proxy = server.seleniumProxy();

	        // конфигурация FirefoxDriver для использования прокси
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(CapabilityType.PROXY, proxy);

	        WebDriver driver = new FirefoxDriver(capabilities);

	        // создание HAR с меткой
	        server.newHar("mypage.ru");

	        // открытие страницы
	        driver.get("http://example.com/index");

	        // получение данных HAR
	        @SuppressWarnings("deprecation")
			Har har = server.getHar();

	        // здесь будет обработка полученных данных
	        // например, сохранение файл
	        ((LegacyProxyServer) proxy).getHar().writeTo(new File("D://Test.har"));

	        driver.quit();
	        server.stop();
	    }
	}

