package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class hooks {
	
WebDriver driver;
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
	

	}
	@After
	public void teardown() {
		
		driver.close();
		
	}

}
