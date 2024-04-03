package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.adactinhotel.qa.factory.DriverFactory;
import com.adactinhotel.qa.pages.BookAHotelPage;
import com.adactinhotel.qa.util.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookAHotelPageSteps {
	
	private BookAHotelPage bookAHotelPage = new BookAHotelPage(DriverFactory.getDriver());
	

	@Given("User is on the BookAHotel page")
	public void user_is_on_the_book_a_hotel_page() {
	    bookAHotelPage.validateBookAHotelPageTitle();
	}
	
	
	@When("user fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
	 ExcelReader reader=new ExcelReader();
	 List<Map<String,String>> testData =reader.getData("src/main/java/com/adactinhotel/qa/testdata/adactinhotelTestData.xlsx", sheetName);
	 String ftname= testData.get(rowNumber).get("firstname");
	 String ltname= testData.get(rowNumber).get("lastname");
	 String add= testData.get(rowNumber).get("address");
	 String ccno= testData.get(rowNumber).get("creditcardno");
	 String cvvno= testData.get(rowNumber).get("cvv");
	 bookAHotelPage.enterBookingDetails(ftname, ltname, add, ccno, cvvno);
	}
	

	@Then("User clicks on book now")
	public void user_clicks_on_book_now() {
		bookAHotelPage.submit();
	}
	
}
