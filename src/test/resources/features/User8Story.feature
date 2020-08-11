
Feature:

  Background: User should be able to create and send workflows by selecting different workflows
    Given User is on the workflow module to create and send workflows

 #@BusinessTrip
  Scenario:User should be able to create and send workflows
    Given User login to account succesfully
    Then User should be able got to More Tab and click
    Then User should click WorkFollow option
    Then User should be able to request a Business Trip
    Then User assigning approvers, processors and entering user instructions
    Then User entering trip Title
    And User choose Destination
    Then User entering date from start date
    And User entering planned end date
    Then User writing Purpose
    And User Planned Expenses
    Then User attach the documents

  Scenario:User should be able to create and send workflows
    Given User should be able to send a General Request
    Then  User entering request Title GR
    And User writing Description
    Then User choosing priority level
    And User select and send Request To field.

  Scenario:User should be able to create and send workflows
    Given User should be able to send a Purchase Request
    Then User assigning approvers for processors
    And User entering Request Title
    Then User writing Amount
    And User and Currency
    And User attach file documents.


  Scenario:User should be able to create and send workflows
    Given User should be able to send a Expense Report
    Then User assigning approvers for process
    And User entering Report TitleThen
    Then User write Description
    And User type Amount
    Then User type Currency
    And User attach files.

  Scenario:User should be able to create and send workflows
    Given User should be able to create new workflows.
    And User should be able to access Workflows Directory page.