package com.adactinhotel.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage {
	private WebDriver driver;

	private By location = By.xpath("//*[@id=\"location\"]");
	private By hotels = By.xpath("//*[@id=\"hotels\"]");
	private By roomtype = By.xpath("//*[@id=\"room_type\"]");
	private By checkInDate = By.xpath("//*[@id=\"datepick_in\"]");
	private By checkOutDate = By.xpath("//*[@id=\"datepick_out\"]");
	private By submitBtn = By.xpath("//input[@id='Submit']");

	// 2. Constructor of the page class:
	public SearchHotelPage(WebDriver driver) {
		this.driver = driver;
	}

	// actions

	public String validateSearchPageTitle() {
		return driver.getTitle();
	}
	
	public void select_locationviadropdown() {
		Select loc = new Select(driver.findElement(location));
		loc.selectByIndex(1);
	}

	public void select_hotelviadropdown() {
		Select hotel = new Select(driver.findElement(hotels));
		hotel.selectByIndex(1);
	}

	public void select_roomtypeviadropdown() {
		Select roomtypes = new Select(driver.findElement(roomtype));
		roomtypes.selectByIndex(1);
	}
	
	public void enterdate(String checkindate, String checkoutdate) {
		driver.findElement(checkInDate).clear();
		driver.findElement(checkInDate).sendKeys(checkindate);
		driver.findElement(checkOutDate).clear();
		driver.findElement(checkOutDate).sendKeys(checkoutdate);
		
	}

	public void submit() {
		driver.findElement(submitBtn).click();
	}

}
