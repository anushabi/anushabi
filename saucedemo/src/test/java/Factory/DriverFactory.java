package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	static WebDriver driver=null;
	
	public static WebDriver initBrowser(String broswername) {
		
		if (broswername=="chrome") {
			
			driver=new ChromeDriver();
			
		} else if(broswername=="friefox") {
			driver=new FirefoxDriver();

		}else {
			if(broswername=="edge") {
				driver=new EdgeDriver();
			}
		}
		return driver;
		
	}

}
