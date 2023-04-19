package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
public static WebDriver driver= null;
	
	public void launchBrowser() {

		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (Exception ex) {
			System.out.println("Problem while launching Browser");
			ex.printStackTrace();
		}

	}

	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {
			driver.close();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
