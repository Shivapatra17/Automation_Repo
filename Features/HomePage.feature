
Feature: HomePage having all functionality.
Description:Test all functionality of a Home page

  @tag1
  Scenario: Test first row of functionality
    Given Open Browser
    When User should enter url "https://rahulshettyacademy.com/AutomationPractice/"
    Then User should in Home page
    And User give some inputs
    Then input fields are having values
    

  