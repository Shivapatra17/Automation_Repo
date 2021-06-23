package com.PracticeProjectWithCucumber.pageActions;

import org.openqa.selenium.WebDriver;

import stepDefinition.CommonSteps;

public class CommonActions {
	
	private WebDriver driver;
	CommonSteps commonSteps;
	public CommonActions(CommonSteps commonSteps) {
		
		this.driver=commonSteps.getDriver();
	}
	
	

}
