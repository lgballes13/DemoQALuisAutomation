#Author: Luis Ballesteros

Feature: Automate the elements for demoqa.com
        interacting with different elements of this option
  
  
  Background:
    Given the client is on the homepage
    When selects the option Elements

  Scenario: interacting with option Text Box
    When selects the option Text Box
    When complete the information
    |fullName|email|currentAddress|permanentAddress|
    |  pueba      |    prueba@example.com  |   prueba1           |    prueba2           |
    Then validate information registered
      |fullName|email|currentAddress|permanentAddress|
      |  pueba      |    prueba@example.com  |   prueba1           |    prueba2           |


    Scenario: interacting with option Check Box
      When selects the option Check Box
      When select the option Notes of Desktop
      Then validate that the message You have selected contains "notes"
      When select the option Documents
      Then validate that the message You have selected contains "workspace" and "office"
      When select the option Word Filedoc of Downloads
      Then validate that message You have selected contains "wordFile"


    Scenario: interacting with option Radio Button
      When selects the option Radio Button
      And selects the Yes option
      Then validate "Yes" in the message You have selected
      And selects the Impressive option
      Then validate "Impressive" in message You have selected


    Scenario: interacting with option Web Tables
      When selects the option Web tables
      And complete the information of form for new register
      |firstName|lastName|email|age|salary|department|
      |Luis     |Preuba  |prueba@example.com|20|2|Antioaquia|
      Then validate the information in the table
       |firstName|lastName|email|age|salary|department|
       |Luis     |Preuba  |prueba@example.com|20|2|Antioaquia|
      When edit the form information
        |firstName|lastName|email|age|salary|department|
        |Andres    |Preuba2  |prueba2@example.com|22|22|Antioaquia2|
      Then validate the information in the table
        |firstName|lastName|email|age|salary|department|
        |Andres    |Preuba2  |prueba2@example.com|22|22|Antioaquia2|
       When eliminate the register
       Then validate the register not exist


    Scenario: interacting with option Buttons
      When selects the option Buttons
      And interact with the different buttons
      Then validate the respective message for each button

    Scenario: interacting with option Links
      When selects the option Links
      And select the home link
      Then validate hompage in the new tab
      When select the dynamic home link
      Then validate hompage in the new tab
      When select the created link
      Then validate status "Created"
      When select the no content link
      Then validate status nc "No Content"
      When select the moved link
      Then validate status mp "Moved Permanently"
      When select the bad request link
      Then validate status br "Bad Request"
      When select the unauthorized link
      Then validate status u "Unauthorized"
      When select the forbidden link
      Then validate status f "Forbidden"
      When select the not found link
      Then validate status nf "Not Found"


    Scenario: interacting with option Upload and Download
        When selects the option Upload and Download
        And upload csv file
        Then visualize the path of file
        When Select button Download
        Then validate correct file download






