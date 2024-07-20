#Author: Luis Ballesteros

Feature: Automate the section forms for demoqa.com
          for interact with the practice form

  Scenario: interacting with option practice form
    Given the client is on the homepage
    When selects the option Forms
    And selects the option Practice Form
    When complete the information of form
    |firstName|lastName|email|gender|mobile|dateBirth|subjects|hobbies|currentAddress|state|city|
    |Luis     |Prueba  |example@example.com|Male|1234567890|13 nov 1992|automation|Music|barrio|NCR|Gurgaon|
    Then validate client information
      |firstName|lastName|email|gender|mobile|dateBirth|subjects|hobbies|currentAddress|state|city|
      |Luis     |Prueba  |example@example.com|Male|1234567890|13 nov 1992|automation|Music|barrio|NCR|Gurgaon|