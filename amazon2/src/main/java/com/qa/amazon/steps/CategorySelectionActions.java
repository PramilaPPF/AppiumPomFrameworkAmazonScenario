package com.qa.amazon.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.qa.amazon.pages.CategorySelectionPage;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by Pramila Fulari on 9/23/2019.
 */

public class CategorySelectionActions extends CategorySelectionPage {
	
	public CategorySelectionActions(AndroidDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public void clickElectronincs() {
		waitForElementPresent(getElectronics());
		waitAndClick(getElectronics());
	}
	
	public void clickKindle() {
		waitForElementPresent(getKindle());
		waitAndClick(getKindle());
	}
	
	public void verifyKindleElement()  {
		waitAndClick(getElectronics());
		Assert.assertEquals(getElementText(getElectronics()), "TV, Appliances, Electronics");
		waitAndClick(getKindle());
		Assert.assertEquals(getElementText(getKindle()), "Kindle E-Readers & eBooks");
		try {
			presenceOfElement(getKindleEreader());
			Assert.assertEquals(getElementText(getKindle()), "Kindle E-Readers & eBooks");
		} catch (Exception e) {
			System.out.println("Element(Kindle E-Reader) Not Found");
		}
	}
	

}
