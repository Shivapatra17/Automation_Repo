package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Brower Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Global Hooks Before Excuted");
	}
	
	@After
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(1000);
		System.out.println("Global Hooks After Excuted");
	}
	
	public WebDriver getDriver() {
		
		return driver;
	}
}
