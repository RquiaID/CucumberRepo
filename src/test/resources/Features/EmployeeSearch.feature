Feature: Searching the employee

 Background:
   When user enters valid email and valid password
   And click on login button
   When user clicks on PIM option
  @smoke1
  Scenario: Search Employee by Id
   # Given open the browser and launch HRMS application
   # When user enters valid email and valid password
   # And click on login button
   # When user clicks on PIM option
    When user enters valid employee id
    And Clicks on search button
    And user sees Employee information is displayed
   # And close the browser

    @smoke1
    Scenario: Search Employee by Job Title
     # Given open the browser and launch HRMS application
     # When user enters valid email and valid password
     # And click on login button
     # When user clicks on PIM option
      When user select Job Title
      And Clicks on search button
      And user sees Employee information is displayed
      #And close the browser


  #Background: This is used to define all the common steps that are duplicate/common
  #  Scenarios have the same feature file, till the time flow is not broken


