package com.adactinhotel.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By username = By.xpath("//*[@id=\"username\"]");
	private By password = By.xpath("//*[@id=\"password\"]");
	private By loginBtn = By.xpath("//*[@id=\"login\"]");
	private By logo = By.xpath("\"/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/img[1]\"");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// actions

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public boolean validateImage() {
		return driver.findElement(logo).isDisplayed();
	}

	public void enterusername(String un) {
		driver.findElement(username).sendKeys(un);
	}

	public void enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(loginBtn).click();
	}

	public SearchHotelPage Login(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		return new SearchHotelPage(driver);
	}
}
