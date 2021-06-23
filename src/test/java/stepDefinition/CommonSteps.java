package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
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
