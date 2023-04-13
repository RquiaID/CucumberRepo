Feature: Login Functionalities

  @smoke
  Scenario: Valid admin login
   # Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully into the application
    #And close the browser

  @smoke2
  Scenario: Valid admin login
   # Given open the browser and launch HRMS application
    When user enters valid "ADMIN" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully into the application
    #And close the browser

  @scenarioOutline
  #Parameterization/ Data Driven
  Scenario Outline:Login with multiple credentials using Scenario Outline
     # Given open the browser and launch HRMS application
    When user enters valid "<username>" and valid "<password>"
    And click on login button
    Then user is logged in successfully into the application
    #And close the browser
    Examples:
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |

  @dataTable
  Scenario: Login with multiple credentials using data table
    When user enters username and password and verifies login
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |






    #HOOKS: they are used for defining pre and Post steps in any Cucumber framework
    #: This is always created inside the StepDefinitions folder
    #: This class cannot be inherited
   #: Hooks will take care of of pre and post conditions irrespective of what goes in between the test steps

  #Background is the clubbing of common steps in different scenarioes of a feature file till flow is not broken
   #1. Hard Code
   #2. Config file
   #-----------------Cucumber itself provides multiple option through which we can feed data from
   # feature file into Step Definition---------------------------------------------
   #3. Regular Expressions
       # put the data in double quotes [""]
  #4. Scenario Outline provides you an alternative to Data driven testing means lets say if you keep data on excel sheet
  # instead of putting data in excel scenario provide ana alternative to data driven, also supports parameterization

#==========================PARAMETERIZATION============================================
  #Executing the same test case with multiple data
  #which annotation supports parameterization in TestNg==> DataProvider==> Interview question

  #If you want to use parameterization
#If you wish to implement data driven testing
  # Scenario Outline is always used along with the keyword 'Examples'
