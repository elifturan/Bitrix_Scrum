Feature:Filter And Search
  Agile Story  9_As a user, I should be able to use ""Filter
  and search "functionality on Active Stream."

  @Filters
  Scenario Outline: 1-User should be able to search by clicking on default filters.
  #(work, favorite, my activity, announcements, and workflows)
    Given User logs in as "helpdesk1@cybertekschool.com" and "UserUser"
    And User should see dashboard
    And User  click  to filter and search
    Then filters text is displayed
    And User click  "<Filter>" option
    And  "<FilterBox>"is displayed
    And  User waits 2 seconds
    Examples:
      | Filter        | FilterBox     |
      | WORK          | Work          |
      | FAVORITES     | Favorites     |
      | MY ACTIVITY   | My Activity   |
      | ANNOUNCEMENTS | Announcements |
      | WORKFLOWS     | Workflows     |

  @DashBoard
  Scenario Outline:2. User should be able to search by selecting
  #Date, Type, Author, To and more default dropdowns.
    Given User logs in as "helpdesk1@cybertekschool.com" and "UserUser"
    When  User should see dashboard
    And User  click  to filter and search
    Then filters text is displayed
    And User selects "<fieldName>" and enters "<fieldValue>"


    Examples:
      | fieldName | fieldValue      |
#      | Date      | Any date        |
      | Date      | Yesterday       |
     #  | Date      | This week       |
#      | Date      | Current quarter |
#      | Date      | Last 7 days     |
#      | Date      | Last 30 days    |
#      | Date      | Last 60 days    |
#      | Date      | Last 90 days    |
#      | Date      | Last N days     |
#      | Date      | Month           |
#      | Date      | Quarter         |
#      | Date      | Year            |
#      | Date      | Exact date      |
#      | Date      | Last week       |
#      | Date      | Last month      |
      | Date      | Custom range    |

  @Type_in
  Scenario Outline: 3. User should be able to type-in keyword to search previous posts.
    Given User logs in as "helpdesk1@cybertekschool.com" and "UserUser"
    And User should see dashboard
    And User  click  to filter and search
    And User click  "<TypeOptions>" option and enter "<TypeValues>"
    Then User clicks search button
    And User should see "Type:PostsPage"is displayed
    Examples:
      | TypeOptions | TypeValues               |
      | Type        | Posts                   |
#  | Type        | Announcements           |
#  | Type        | Appreciations           |
#  | Type        | Polls                   |
#  | Type        | Conversations           |
#  | Type        | Tasks                   |
#  | Type        | Working time management |
#  | Type        | Work reports            |
#  | Type        | Calendar                |
#  | Type        | External source data    |
#  | Type        | Photo gallery           |
#  | Type        | Wiki                    |
#  | Type        | Workflows               |
#  | Type        | Work reports            |
#  | Type        | Calendar                |




  @SaveFilter
  Scenario:4. User should be able to use Save Filter functionality on search bar.
    Given User logs in as "helpdesk1@cybertekschool.com" and "UserUser"
    And User should see dashboard
    Then User  click  to filter and search
    And User clicks SAVE FILTER
    Then User  should be add new filter name
    And User should be save new filter
