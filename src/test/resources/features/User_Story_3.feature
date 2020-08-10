@userstory3
Feature:Event tab
  3. As a user, I should be able to create
events by clicking on Event tab under Activity Stream.

  Background: User is on Bitrix24 page
    Given User is logged in
    And  user click on Event Tab
  @uploadfile
  Scenario: 1.User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
    And click on upload files and picture from Event Module
    And write some message on file name
    And upload a picture for Event
    Then verify if the Picture is uploaded
  @linkicon
  Scenario: 3.User should be able to attach link by clicking on the link icon.
    And click on Link Button from Event Tab
    And click and write some Text in Text Form
    And upload the link in the link Form, and click on Save Button
    Then Verify if click is uploaded

 @videoicon
  Scenario: 4.User should be able to insert videos by clicking on the video icon and entering the video URL.
    And write some message for the video description in Event Tab
    And upload the video and save it
    Then Verify if it's uploaded

 @quote
  Scenario: 5.User should be able to create a quote by clicking on the Comma icon.
    And click on Comma Button from the Event Tab
    And click on Quote Tab and write a quote "Hello World"
    And click on Send Button
    Then Verify if the Quote is displayed on the page

  @visualEditor
  Scenario: 6.User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    And click on Visual Editor from the Event
    Then  verify if it's displayed the Visual Editor


  @datetime
  Scenario: 7. User should be able to add Event start and ending date and time, and specify the time zone.
    When user should add date and time and click time zone


   @reminder
  Scenario:   8. User should be able to set reminder by entering the timeing.
    And user should click set reminder button and write 15 minutes

   @location
  Scenario:   9. User should be able to select event location from dropdown.
    And user should select Central meeting room

   @addingcontact
  Scenario: 10. User should be able to add attendees by selecting contacts individually or adding groups and departments.
    And user should add person from members icon

  @more
  Scenario: 11. User should be able to click on More to specify the event details.
    And user should select free from dropdown availability
    And user should select never from dropdown  repeat
    And user should see own email
    And user should select normal from dropdown importance
    Then user should click send button
    Then verify if the assigned Task is created










