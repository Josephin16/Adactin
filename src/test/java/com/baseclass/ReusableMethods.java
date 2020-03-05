package com.baseclass;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {

	public static WebDriver drive;
	public static final String USERNAME = "josephin1";
	  public static final String AUTOMATE_KEY = "MDKcCKspKxH6frmfNLm6";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	/*public void launch() {
		// System.setProperty("webdriver.chrome.driver","D:\\Java
		// workspace\\proPom\\pom.xml");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java workspace\\Addactin\\Driver\\chromedriver.exe");
		drive = new ChromeDriver();

	}*/
	 public void executeCloud() throws MalformedURLException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "79.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1024x768");
		    caps.setCapability("name", "Bstack-[Java] Sample Test");

		    drive = new RemoteWebDriver(new java.net.URL(URL), caps);
	}

	public void loadurl(String url) {
		drive.get(url);
		drive.manage().window().maximize();
	}

	public void sendkeys(WebElement e, String send) {
		e.clear();
		e.sendKeys(send);
	}

	public void cli(WebElement e) {
		e.click();
	}

	public void findelementByID(String id) {
		drive.findElement(By.id(id));
	}

	public void findelementByXpath(String xpath) {
		drive.findElement(By.xpath(xpath));
	}

	public void dropdown(WebElement b, String text) {
		Select s = new Select(b);
		s.selectByVisibleText(text);
	}

	public void ordernoid(String str, int seconds) {
		WebDriverWait w = new WebDriverWait(drive, 10);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id(str)));
	}

	public void assertmethod(String url) {
		Assert.assertEquals("Incorrect URL", url, drive.getCurrentUrl());
	}

	public void assertall(List<WebElement> e, String s) {
		Assert.assertEquals("failure", s, e.get(0).getAttribute("value"));
	}

	public byte[] screenshot() {
		TakesScreenshot tk = (TakesScreenshot) drive;
		byte[] b = tk.getScreenshotAs(OutputType.BYTES);
		return b;
	}
}
