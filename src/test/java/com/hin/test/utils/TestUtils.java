package com.hin.test.utils;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Allure;

public class TestUtils {

	/**
	 * Take a screenshot and save it.
	 * @param webdriver Selenium web driver
	 * @param path save folder
	 * @throws Exception
	 */
	public static void takeSnapShot(WebDriver driver) throws Exception {
		Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	}

}
