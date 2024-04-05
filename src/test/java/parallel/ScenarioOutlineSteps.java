package parallel;

import com.adactinhotel.qa.factory.DriverFactory;
import com.adactinhotel.qa.pages.ScenarioOutline;

import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	private ScenarioOutline scenarioOutline = new ScenarioOutline(DriverFactory.getDriver());
	
	@When("user enters credit card details and the {string} {string} {string} {string} {string}")
	public void user_enters_credit_card_details_and_the(String firstname, String lastname, String address, String creditcardno, String cvv) throws InterruptedException {
		scenarioOutline.enterBookingDetails(firstname, lastname, address, creditcardno, cvv);
	}

}
