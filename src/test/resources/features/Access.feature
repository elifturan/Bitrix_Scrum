Feature:  I should be able to interact with employees on the posts that
  I have access to.

@Access
  Scenario Outline: 10. As a user, I should be able to interact with employees on the posts that I have access to.
  Given User is on the login page
  When User enters correct username "<username>"
  And User enters correct password "<password>"
  And User clicks login button
  And User clicks the comment button
  And User make a comment "<comment>"
  And User clicks the like button
  And user clicks the unfollow
  And User should be able to view, like, or make comments on all other reviewers's comments.
  And User should be able to click on reviewers' name and visit their profiles "<visit profile>"
  Then User should be able to add others' posts to favorate by clicking on the Star icon.



  Examples:
    | username | password | comment | visit profile |
|     helpdesk49@cybertekschool.com       |   UserUser         |   hello wold       |     hr43@cybertekschool.com            |