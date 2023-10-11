package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class s {

	ChromeDriver ob;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("in login page");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TUP ELE SECTION\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");	
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Entering username and password");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("clicking");
		//classname = btn_log
				ob.findElementByClassName("btn_log").click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("in home");	
	}
}
