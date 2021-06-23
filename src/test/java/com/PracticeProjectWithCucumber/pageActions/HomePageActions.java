package com.PracticeProjectWithCucumber.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.PracticeProjectWithCucumber.pageObject.HomePageWebElements;

import stepDefinition.CommonSteps;

public class HomePageActions {
	
	private WebDriver driver;
	
	HomePageWebElements homePageWE;
	
	
	
	public HomePageActions(CommonSteps commonSteps) {
		this.driver=commonSteps.getDriver();
		homePageWE = new HomePageWebElements(driver);
	}
	
	public String getTitle() {
		String title = homePageWE.practicePageTextView.getText();
		return title;
	}

	public void clickHomeBtn() {
		homePageWE.homeButton.click();
	}
	public void clickPracyiceButton() {
		homePageWE.pracyiceButton.click();
	}
	public void clickLoginButton() {
		homePageWE.loginButton.click();
	}
	public void clickSignupButton() {
		homePageWE.signupButton.click();
	}
	public void slectRadioBtn1() {
		homePageWE.radioButton1.click();
	}
	public void slectRadioBtn2() {
		homePageWE.radioButton2.click();
	}
	public void slectRadioBtn3() {
		homePageWE.radioButton3.click();
	}
	public void enterContory(String country) {
		homePageWE.contryInputFiled.sendKeys(country);
	}
	public void selectDropDown(String option) {
		
		WebElement listBox = homePageWE.dropDownList;
		Select select = new Select(listBox);
		select.selectByVisibleText(option);
		
	}
}
