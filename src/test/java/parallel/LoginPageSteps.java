package parallel;

import org.testng.Assert;

import com.adactinhotel.qa.factory.DriverFactory;
import com.adactinhotel.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private static String title;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		DriverFactory.getDriver().get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
	}

	@When("User gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.validatePageTitle();
		System.out.println("page title is " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("User enters valid username {string}")
	public void user_enters_valid_username(String username) {
		loginPage.enterusername(username);

	}

	@When("User enters valid password {string}")
	public void user_enters_valid_password(String password) {
		loginPage.enterpassword(password);

	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		loginPage.clickOnLogin();
	}

	@Then("User gets the title of the search hotel page")
	public void user_should_be_redirected_to_the_search_hotel_page() {
		title = loginPage.validatePageTitle();
		System.out.println("page title is" + title);
		Assert.assertEquals(title, "Adactin.com - Search Hotel");

	}
}
