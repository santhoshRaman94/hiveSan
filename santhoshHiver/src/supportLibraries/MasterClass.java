package supportLibraries;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MasterClass {

	public static WebDriver driver;

	
	@SuppressWarnings("deprecation")
	@BeforeTest
	
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\git\\hiveSan\\santhoshHiver\\src\\jarsAndDrivers\\BrowserDrivers\\chromedriver.exe");
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addExtensions(new File("C:\\Users\\Santhosh\\workspace\\HiverTrial01\\Hiver.crx"));
		DesiredCapabilities desiredcapabilities=DesiredCapabilities.chrome();
		desiredcapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		// "C:\Users\Santhosh\workspace\HiverTrial01\Hiver.crx

driver= new ChromeDriver(desiredcapabilities);
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/");
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void close() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		}
		driver.quit();
		

	}
}
