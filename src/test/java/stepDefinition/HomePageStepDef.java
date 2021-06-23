package stepDefinition;

import org.junit.Assert;

import com.PracticeProjectWithCucumber.pageActions.CommonActions;
import com.PracticeProjectWithCucumber.pageActions.HomePageActions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	CommonActions commonActions;
	HomePageActions homepageActions;
	public HomePageStepDef(CommonActions commonActions,HomePageActions homepageActions) {
		
		this.commonActions = commonActions;
		this.homepageActions = homepageActions;
	}
	
@Given("Open Browser")
public void open_browser() {
	System.out.println("----------------- Given Open Browser");
}

@When("User should enter url {string}")
public void user_should_enter_url(String url) {
	commonActions.goToUrl(url);
	
}

@Then("User should in Home page")
public void user_should_in_home_page() {
	String title = homepageActions.getTitle();
	System.out.println(" ----- Then Practice Page=="+title);
	Assert.assertEquals("Practice Page", title);
}

@And("^User give some inputs RadioBtn as\"([^\"]*)\" countory as\"([^\"]*)\" dropDown as\"([^\"]*)\" checkBox as\"([^\"]*)\"$")
public void user_give_some_inputs_radiobtn_assomething_countory_assomething_dropdown_assomething_checkbox_assomething(String radiooptions, String country, 
		String dropdownoptions, String checkboxoptions) {
	System.out.println("-----And 333333333 ----RadioBtn:"+radiooptions+" countory :"+country+" dropDown:"+dropdownoptions+" checkBox :"+checkboxoptions);
	homepageActions.selectOption(radiooptions);
	homepageActions.enterContory(country);
	homepageActions.selectDropDown(dropdownoptions);
	homepageActions.selectOption(checkboxoptions);
}


@Then("input fields are having values")
public void input_fields_are_having_values() {
   
	
}

	
}
