package com.adactinhotel.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectHotelPage {

	private WebDriver driver;
	
	// 1. By Locators: OR
	private By selectHotelBtn = By.xpath("//*[@id=\"radiobutton_0\"]");
	private By continueBtn = By.xpath("//*[@id=\"continue\"]");
	
	// 2. Constructor of the page class:
		public SelectHotelPage(WebDriver driver) {
			this.driver = driver;
		}
		
		// Actions
		public String validateSelectPageTitle() {
			return driver.getTitle();
		}

		public void selectHotel() {
			driver.findElement(selectHotelBtn).click();;
		}

		public void submit() {
			driver.findElement(continueBtn).click();;
			
		}
}
