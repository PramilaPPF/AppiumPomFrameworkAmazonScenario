package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
/**
 * Created by Pramila Fulari on 9/23/2019.
 */
public class CategorySelectionPage extends BasePage {

	public CategorySelectionPage(AndroidDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// page locators:

	private By electronics = By.xpath("//android.view.View[contains(@text, 'TV, Appliances, Electronics')]");

	private By kindle = By.xpath("//android.view.View[contains(@text, 'Kindle E-Readers & eBooks')]");

	private By kindleEreader = By.xpath("//android.view.View[contains(@text, 'Kindle E-Readers ')]");

	/*
	 * 
	 *  To simulate error when element(kindleEreader) does not exist on expected page
	 */ 
	 // By nonexistingElement = By.xpath("//android.view.View[contains(@text,'nonexistingElement')]");
	 

	public By getElectronics() {
		waitForElementPresent(electronics);
		return electronics;
	}

	public By getKindle() {
		waitForElementPresent(kindle);
		return kindle;
	}

	public By getKindleEreader() {
		waitForElementPresent(kindleEreader);
		return kindleEreader;
	}
}
