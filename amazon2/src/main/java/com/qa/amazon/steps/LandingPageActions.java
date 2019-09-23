package com.qa.amazon.steps;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.amazon.pages.LandingPage;
import io.appium.java_client.android.AndroidDriver;
/**
 * Created by Pramila Fulari on 9/23/2019.
 */
public class LandingPageActions extends LandingPage {

	public LandingPageActions(AndroidDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public void clickHamburger() {
		waitForElementPresent(getHamburger());
		waitAndClick(getHamburger());
	}

	public CategorySelectionActions selectShopByCategory() {
		waitAndClick(getShopByCategory());		
		return getInstance(CategorySelectionActions.class);
	}

}
