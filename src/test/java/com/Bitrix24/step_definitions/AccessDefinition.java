package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.AccessPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccessDefinition {

    AccessPage element=new AccessPage();

    @When("User clicks the comment button {string}")
    public void user_clicks_the_comment_button(String string) {
        element.commentButton.click();
    }

    @When("User make a comment {string}")
    public void user_make_a_comment(String string) {
      element.getCommentButton.sendKeys("hello world");
    }


    @When("User clicks the like button")
    public void user_clicks_the_like_button() {
      element.likeButton.click();
    }

    @When("user clicks the unfollow")
    public void user_clicks_the_unfollow() {
        element.unfollowButton.click();

    }

    @When("User should be able to view, like, or make comments on all other reviewers's comments.")
    public void user_should_be_able_to_view_like_or_make_comments_on_all_other_reviewers_s_comments() {

    }

    @When("User should be able to click on reviewers' name and visit their profiles {string}")
    public void user_should_be_able_to_click_on_reviewers_name_and_visit_their_profiles(String string) {

    }

    @Then("User should be able to add others' posts to favorate by clicking on the Star icon.")
    public void user_should_be_able_to_add_others_posts_to_favorate_by_clicking_on_the_star_icon() {

    }



}




