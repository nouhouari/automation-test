package com.hin.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		// For @FindBy annotation to work
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[href='actions/Catalog.action']")
	private WebElement enterShopLink;
	
	@Step("Go to home page")
	public void goToPage() {
		driver.get("https://petstore.octoperf.com/");
	}
	
	@Step("Go to store")
	public void goToStore() {
		enterShopLink.click();
	}
	
}
