package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageWebElements {
	
	
@FindBy(xpath="//button[text()='Home']") WebElement homeButton;
@FindBy(xpath="//button[text()='Practice']") WebElement pracyiceButton;
@FindBy(xpath="//button[text()='Login']") WebElement loginButton;
@FindBy(xpath="//button[text()='Signup']") WebElement signupButton;
@FindBy(xpath="//h1[text()='Practice Page']") WebElement practicePageTextView;
@FindBy(xpath="//input[@value='radio1']") WebElement RadioButton1;
@FindBy(xpath="//input[@value='radio2']") WebElement RadioButton2;
@FindBy(xpath="//input[@value='radio3']") WebElement RadioButton3;
@FindBy(id="autocomplete") WebElement contryInputFiled;
@FindBy(xpath="//select[@id='dropdown-class-example']") WebElement dropDownList;
@FindBy(xpath="//input[@id='checkBoxOption1']") WebElement checkBoxOption1;
@FindBy(xpath="//input[@id='checkBoxOption2']") WebElement checkBoxOption2;
@FindBy(xpath="//input[@id='checkBoxOption3']") WebElement checkBoxOption3;
@FindBy(css="#openwindow") WebElement openWindow;
@FindBy(css="#opentab") WebElement opentab;
@FindBy(css="#name") WebElement alertInputField;
@FindBy(css="#alertbtn") WebElement alertBtn;
@FindBy(css="#confirmbtn") WebElement alertConfirmBtn;
@FindBy(xpath="//table[@name='courses']") WebElement webTable;
@FindBy(css="#hide-textbox") WebElement hideBtn;
@FindBy(css="#show-textbox") WebElement showBtn;
@FindBy(xpath="//div[@class='tableFixHead']") WebElement webTableFixedHeader;
@FindBy(xpath="//div[@class='totalAmount']") WebElement totalAmountTextView;
@FindBy(css="#mousehover") WebElement mousehover;
@FindBy(xpath="//iframe[@id='courses-iframe']") WebElement iframe;




}
