package parallel;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.adactinhotel.qa.factory.DriverFactory;
import com.adactinhotel.qa.pages.LoginPage;
import com.adactinhotel.qa.pages.SearchHotelPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchHotelPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private SearchHotelPage searchHotelPage;

	@Given("user has already logged into application")
	public void user_has_already_logged_into_application(DataTable dataTable) {
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		DriverFactory.getDriver().get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		searchHotelPage = loginPage.Login(userName, password);

	}

	@Given("User is on the SearchHotel page")
	public void user_is_on_the_search_hotel_page() {
		searchHotelPage.validateSearchPageTitle();

	}

	@Then("User select the location from dropdown")
	public void user_select_the_location_from_dropdown() {
		searchHotelPage.select_locationviadropdown();

	}

	@Then("User select the hotel from dropdown")
	public void user_select_the_hotel_from_dropdown() {
		searchHotelPage.select_hotelviadropdown();
	}

	@Then("User select the roomtype from dropdown")
	public void user_select_the_roomtype_from_dropdown() {
		searchHotelPage.select_roomtypeviadropdown();
	}

	@Then("User enters the checkindate as current date")
	public void user_enters_the_checkindate_as_current_date() {
		searchHotelPage.enterdate();
	}

	@Then("User enters the checkoutdate as current dateplus2days")
	public void user_enters_the_checkoutdate_as_current_dateplus2days() {
		searchHotelPage.enterdate();
	}
	



	@Then("User clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		searchHotelPage.submit();

	}

	@Then("User gets the title of the select hotel page")
	public void user_gets_the_title_of_the_select_hotel_page() {
		String title = searchHotelPage.validateSearchPageTitle();
		System.out.println("page title is " + title);
		Assert.assertEquals(title, "Adactin.com - Select Hotel");

	}

}
