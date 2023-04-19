package gluecode;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseTest;

public class LoginGlue extends BaseTest {

	@Given("Navigate to W3Schools")
	public void navigate_to_w3schools() {
		try {

			driver.get("https://profile.w3schools.com/");
			Thread.sleep(2000);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@When("I enter the username")
	public void i_enter_the_username() {
		try {

			driver.findElement(By.id("modalusername")).sendKeys("suganit37@gmail.com");
			Thread.sleep(2000);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@When("I enter the password")
	public void i_enter_the_password() {
		try {

			driver.findElement(By.id("current-password")).sendKeys("GSuganya@1234");
			Thread.sleep(2000);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Then("Click on Login button for successful login")
	public void click_on_login_button_for_successful_login() {
		try {

			driver.findElement(By.xpath("//span[text()='Log in']")).click();
			Thread.sleep(2000);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@When("I enter the incorrect password")
	public void i_enter_the_incorrect_password() {
		try {

			driver.findElement(By.id("current-password")).sendKeys("GSuganya@1");
			Thread.sleep(2000);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Then("Click on Login button for unsuccessful login")
	public void click_on_login_button_for_unsuccessful_login() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
