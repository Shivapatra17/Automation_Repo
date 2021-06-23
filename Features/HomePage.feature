
Feature: HomePage having all functionality.
Description:Test all functionality of a Home page

  Scenario Outline: Test first row of functionality
    Given Open Browser
    When User should enter url "https://rahulshettyacademy.com/AutomationPractice"
    Then User should in Home page
    And User give some inputs RadioBtn as"<RadioOptions>" countory as"<Country>" dropDown as"<DropDownOptions>" checkBox as"<CheckBoxOptions>"
    Then input fields are having values
    
   Examples:
   |RadioOptions|Country|DropDownOptions|CheckBoxOptions|
   |Radio1      |India  |Option1        |Option1        |
   |Radio2      |Landon |Option2        |Option2        |
   |Radio3      |UK     |Option3        |Option2        |

  