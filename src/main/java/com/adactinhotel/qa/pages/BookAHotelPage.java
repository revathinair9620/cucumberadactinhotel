package com.adactinhotel.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BookAHotelPage {
	private WebDriver driver;

	// 1. By Locators: OR
	private By firstname = By.xpath("//input[@id='first_name']");
	private By lastname = By.xpath("//input[@id='last_name']");
	private By address = By.xpath("//textarea[@id='address']");
	private By creditcardno = By.xpath("//input[@id='cc_num']");
	private By creditCardType = By.xpath("//select[@id='cc_type']");
	private By expiryMonth = By.xpath("//select[@id='cc_exp_month']");
	private By expiryYear = By.xpath("//select[@id='cc_exp_year']");
	private By cvvno = By.xpath("//input[@id='cc_cvv']");
	private By bookNowBtn = By.xpath("//input[@id='book_now']");
	
	// 2. Constructor of the page class:
	public BookAHotelPage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions:
	public String validateBookAHotelPageTitle() {
		return driver.getTitle();
	}

	public void enterBookingDetails(String ftname, String ltname, String addr, String ccno, String cvv)
			throws InterruptedException {
		driver.findElement(firstname).sendKeys(ftname);
		driver.findElement(lastname).sendKeys(ltname);
		driver.findElement(address).sendKeys(addr);
		driver.findElement(creditcardno).sendKeys(ccno);
		driver.findElement(cvvno).sendKeys(cvv);
		Select creditcardtype = new Select(driver.findElement(creditCardType));
		creditcardtype.selectByValue("VISA");
		Select expirymon = new Select(driver.findElement(expiryMonth));
		expirymon.selectByIndex(1);
		Select expiryyear = new Select(driver.findElement(expiryYear));
		expiryyear.selectByValue("2027");
		Thread.sleep(1000);

	}

//	public void select_creditCardDetails() {
//		Select creditcardtype = new Select(driver.findElement(creditCardType));
//		creditcardtype.selectByValue("VISA");
//		Select expirymon = new Select(driver.findElement(expiryMonth));
//		expirymon.selectByIndex(1);
//		Select expiryyear = new Select(driver.findElement(expiryYear));
//		expiryyear.selectByValue("2027");
//	}

	public BookingConfirmationPage submit() {
		driver.findElement(bookNowBtn).click();
		return new BookingConfirmationPage(driver);
	}
	
	

}
