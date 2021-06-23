package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	public WebDriver driver;
	
	public HomePageStepDef(CommonSteps commonSteps) {
		
		this.driver = commonSteps.getDriver();
		PageFactory.initElements(driver, this);
	}
	
@Given("Open Browser")
public void open_browser() {
    
	
}

@When("User should enter url {string}")
public void user_should_enter_url(String string) {
  
}

@Then("User should in Home page")
public void user_should_in_home_page() {
   
}

@And("User give some inputs")
public void user_give_some_inputs() {
  
}

@Then("input fields are having values")
public void input_fields_are_having_values() {
   
}

	
}
