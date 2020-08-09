
Feature:As a user, I should be able to assign tasks by clicking on Task tab under Active Stream.
Background: Login
    Given User is on the login page
    When User enters correct username
    And User enters correct password
    And User clicks login button
    And User click on the tasks tab plus symbol
@HighPriority
  Scenario:1. User should be able to click on "High Priority" checkbox to set the current task to a top priority task.
    Given click on High Priority checkbox
    Then set the current task  to a top Priority task
@VisualEditor
  Scenario:2. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    And click on Visual Editor
    Then verify if it's showed up
@UploadFiles
  Scenario:3. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
    Then click on upload files icon
    Then  Upload files and picture
    Then Verify if picture it's uploaded
@documents
  Scenario:3.1 Select documents from bitrix
    Then click on upload files icon
    And  Click on Select Document from Bitrix
    And  Select documents from bitrix
    Then  verify if the document  it's uploaded
@comma
  Scenario:4. User should be able to create a quote by clicking on the Comma icon.
    And Click on Comma Icon
    Then Create a quote
    Then verify if it's displayed
@addMention
  Scenario:5. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
    Given  Click on the Add mention icon
    And select contacts from the lists provided in dropdown
    Then Verify if the addMention emails are added.
@attachLink
  Scenario:6. User should be able to attach link by clicking on the link icon.
    And click on the link icon
    And atach link
    Then verify is the link it's uploaded
@AddMore
  Scenario:7. User can assign the tasks to employees by clicking on Add More and selecting contact from E-mail user, Employees and Departments and Recent contact lists.
    When click on Add More
    And select contact from E-mail User, Employees and Departments and Recent Contact List
    Then verify if Add More selecting contact from  E-mail user, Employees and Departments and Recent contact lists works.
@Assignment
  Scenario:8. Employees can be added in different assignment categories: Created By, Participants and Observer.
    When click on created by
    When click participants and people
    And click on Observers and add people
    Then verify if Employees can be added in different assignment categories: Created By, Participants and Observer.
@Deadline
  Scenario:9. User can add Deadline, Time Planning by using date pickers.
    Given Click on Deadline
    Given select date and time
    Then verify is the Deadline is saved
@More
  Scenario:10. User can click on More to specify the task details."
    And  Click on More

