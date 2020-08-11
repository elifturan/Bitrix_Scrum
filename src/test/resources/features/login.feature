   @wip
  Feature:
    Agile Story: As a user, I should be able to create and send workflows by selecting different workflows
    from "More" tab under Activity Stream.

    Background: chrome testing
      Given user test with "chrome" browser

    @LeaveApproval
    Scenario:User should be able to create and send workflows
      Given User login to account succesfully
      Then User should be able got to More Tab and click
      Then User should click WorkFollow option
      Then User should be able to request a Leave Approval
      Then User assigning approvers and processors; selecting start
      And  User ending date from date picker
      Then User select Absence type from dropdown;
      And User entering reason for leave information.



