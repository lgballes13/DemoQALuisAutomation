#Author: Luis Ballesteros

Feature: Automate the section alerts frames y windows for demoqa.com
  interacting with the modal dialogs

  Scenario: interacting with option Modal Dialogs
    Given the client is on the homepage
    When selects the option Alerts frames and windows
    And selects the option Modal Dialogs
    When interact whit small modal
    Then validate message small modal
    When interact with large modal
    Then validate message large modal


