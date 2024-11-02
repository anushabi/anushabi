package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;


public class Login {
	
	WebDriver driver;
	private loginPage p;

	
	@Given("user navigate to the login page")
	public void user_navigate_to_the_login_page1() {
		
		System.out.println();
		
	}

	@When("user enter the valid username {string}")
	public void user_enter_the_valid_username(String uname) {
		
		 p = new loginPage(driver);
		p.usename(uname);
	}

	@And("user enter the valid password {string}")
	public void user_enter_the_valid_password(String pw) {
		
		p.password(pw);
	
	}

	@And("user click on the login button")
	public void user_click_on_the_login_button1() {
		
		p.login();
		
	}

	@Then("User login into the login page")
	public void user_login_into_the_login_page() {
	   
	}

	@Given("User navigate to the login page")
	public void user_navigate_to_the_login_page() {
	    
	}

	@When("User enter the invalid username {string}")
	public void user_enter_the_invalid_username(String username) {
		p.usename(username);
	    
	  
	}

	@And("User user enther the valid password {string}")
	public void user_user_enther_the_valid_password(String pass) {
	    p.password(pass);
	}

	@And("User click on the login button")
	public void user_click_on_the_login_button() {
		p.login();
	  
	}

	@Then("User should need to get warning message")
	public void user_should_need_to_get_warning_message() {
	   
	}

	@Given("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
	   
	}

	@And("User enter the incorrect username {string}")
	public void user_enter_the_incorrect_username(String string) {
		p.usename(string);
	   
	}

	@Then("user should to get warning messgae")
	public void user_should_to_get_warning_messgae() {
	    
	}

}
