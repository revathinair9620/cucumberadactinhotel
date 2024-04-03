package com.adactinhotel.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingConfirmationPage {
	private WebDriver driver;

	// 1. By Locators: OR
	private By orderNo = By.xpath("//td[contains(text(),'Order No.')]");

	// 2. Constructor of the page class:
		public BookingConfirmationPage(WebDriver driver) {
			this.driver = driver;
		}

	// Actions:
	public String validateBookConfirmationTitle() throws InterruptedException {
		Thread.sleep(10000);
		return driver.getTitle();
	}

	public BookedItineraryPage validateOderNo() {
		driver.findElement(orderNo).isDisplayed();
		return new BookedItineraryPage();
	}
	

}
