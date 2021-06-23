package com.PracticeProjectWithCucumber.pageActions;

import org.openqa.selenium.WebDriver;

import stepDefinition.CommonSteps;

public class CommonActions {
	
	private WebDriver driver;
	CommonSteps commonSteps;
	
	public CommonActions(CommonSteps commonSteps) {
		
		this.driver=commonSteps.getDriver();
	}
	
	public void goToUrl(String url) {
		
		driver.get(url);
	}
	
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
	public void quitWebDriver() {
		 driver.quit();
	}
}
