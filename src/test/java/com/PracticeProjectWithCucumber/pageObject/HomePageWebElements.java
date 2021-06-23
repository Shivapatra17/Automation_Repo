package com.PracticeProjectWithCucumber.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.CommonSteps;

public class HomePageWebElements {
	
	public WebDriver driver;
	
	public HomePageWebElements(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//button[text()='Home']") public WebElement homeButton;
@FindBy(xpath="//button[text()='Practice']") public WebElement pracyiceButton;
@FindBy(xpath="//button[text()='Login']") public WebElement loginButton;
@FindBy(xpath="//button[text()='Signup']") public WebElement signupButton;
@FindBy(xpath="//h1[text()='Practice Page']") public WebElement practicePageTextView;
@FindBy(xpath="//input[@value='radio1']") public WebElement radioButton1;
@FindBy(xpath="//input[@value='radio2']") public WebElement radioButton2;
@FindBy(xpath="//input[@value='radio3']") public WebElement radioButton3;
@FindBy(id="autocomplete") public WebElement contryInputFiled;
@FindBy(xpath="//select[@id='dropdown-class-example']") public WebElement dropDownList;
@FindBy(xpath="//input[@id='checkBoxOption1']") public WebElement checkBoxOption1;
@FindBy(xpath="//input[@id='checkBoxOption2']") public WebElement checkBoxOption2;
@FindBy(xpath="//input[@id='checkBoxOption3']") public WebElement checkBoxOption3;
@FindBy(css="#openwindow") public WebElement openWindow;
@FindBy(css="#opentab") public WebElement opentab;
@FindBy(css="#name") public WebElement alertInputField;
@FindBy(css="#alertbtn") public WebElement alertBtn;
@FindBy(css="#confirmbtn") public WebElement alertConfirmBtn;
@FindBy(xpath="//table[@name='courses']") public WebElement webTable;
@FindBy(css="#hide-textbox") public WebElement hideBtn;
@FindBy(css="#show-textbox") public WebElement showBtn;
@FindBy(xpath="//div[@class='tableFixHead']") public WebElement webTableFixedHeader;
@FindBy(xpath="//div[@class='totalAmount']") public WebElement totalAmountTextView;
@FindBy(css="#mousehover") public WebElement mousehover;
@FindBy(xpath="//iframe[@id='courses-iframe']") public WebElement iframe;


	

}
