package parallel;





import com.adactinhotel.qa.factory.DriverFactory;

import com.adactinhotel.qa.pages.BookingConfirmationPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class BookingConfirmationPageSteps {
	

	
	private BookingConfirmationPage bookingConfirmationPage = new BookingConfirmationPage(DriverFactory.getDriver());

	
	@Given("User is on the BookingConfirmation page")
	public void user_is_on_the_booking_confirmation_page() throws InterruptedException {
		bookingConfirmationPage.validateBookConfirmationTitle();
	}

	@Then("verify the order no")
	public void verify_the_order_no() {
		bookingConfirmationPage.validateOderNo();
	   
	}
}
