package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	public  loginPage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement usename;
	
	public void usename(String username) {
		usename.sendKeys(username);
		
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passowrd;
	
	public void password(String pass) {
		passowrd.sendKeys(pass);
	}
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login;

	public void login() {
		login.click();
		
	}
}
