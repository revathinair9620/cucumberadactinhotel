package stepdefinitions;



import org.testng.Assert;

import com.adactinhotel.qa.factory.DriverFactory;
import com.adactinhotel.qa.pages.SelectHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SelectHotelPageSteps {

	// private SelectHotelPage selectHotelPage;
	private SelectHotelPage selectHotelPage = new SelectHotelPage(DriverFactory.getDriver());
	

	@Given("User is on the SelectHotel page")
	public void user_is_on_the_select_hotel_page() {
		selectHotelPage.validateSelectPageTitle();
	}

	@Then("User clicks the hotel radiobutton")
	public void user_clicks_the_hotel_radiobutton() {
		selectHotelPage.selectHotel();

	}

	@Then("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
		selectHotelPage.submit();

	}

	@Then("User gets the title of the book a hotel page")
	public void user_gets_the_title_of_the_book_a_hotel_page() {
		String title = selectHotelPage.validateSelectPageTitle();
		System.out.println("page title is " + title);
		Assert.assertEquals(title, "Adactin.com - Book A Hotel");
	}

}
