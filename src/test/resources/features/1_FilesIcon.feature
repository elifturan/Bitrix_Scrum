

@bitrix
Feature: Files Icon
  Agile Story 1 :
  As a user , I should be able to click on upload files icon to upload files and pictures from local disks,
 download from external drive, select documents from bixtrix24, and create files to upload.

  Background: User has already logged in and currently
    Given User is on the login page
    Then user logs in


# 1. User should be able to click on upload files icon to upload files and pictures from local disks,
# download from external drive, select documents from bixtrix24, and create files to upload.
  @filesIcon
  Scenario:User should be able to click on upload files icon
    When user should be able to click on upload files icon
    Then user should be able to  upload files
    Then user should  be able to upload pictures from local disks
    Then User should be able to download from external drive
    Then user should be able to select documents from bixtrix24
    Then user should be able to create files to upload.








