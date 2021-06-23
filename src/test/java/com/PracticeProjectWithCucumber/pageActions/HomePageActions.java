package com.PracticeProjectWithCucumber.pageActions;

import java.util.ArrayList;

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
	public void selectOption(String option) {
		char firstChar = option.charAt(0);
		char lastChar = option.charAt(option.length() - 1);
		
		switch(lastChar) {
		  case '1':
			  	if(firstChar=='c') {homePageWE.checkBoxOption1.click();}
			  	else { homePageWE.radioButton1.click();}
		    break;
		  case '2':
				if(firstChar=='c') {homePageWE.checkBoxOption2.click();}
			  	else { homePageWE.radioButton2.click();}
		    break;
		  case '3':
				if(firstChar=='c') {homePageWE.checkBoxOption3.click();}
			  	else { homePageWE.radioButton3.click();}
			break;
		  default:
		    // code block
		}
		
	}
	
	public void enterContory(String country) {
		homePageWE.contryInputFiled.sendKeys(country);
	}
	public void selectDropDown(String option) {
		WebElement listBox = homePageWE.dropDownList;
		Select select = new Select(listBox);
		select.selectByVisibleText(option);	
	}
	
/*	public String getSelectedRadioButton() {
		String stringvalue=null;
		int count = homePageWE.listradioButton.s
		for(int i=0;i;i++)
		 boolean selectedRadioButton = homePageWE.listradioButton.isSelected();
		 if(selectedRadioButton) {
			 stringvalue = homePageWE.listradioButton.getText();
		 }
		return stringvalue;
	}
	*/
	

}
