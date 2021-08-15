Feature: Validating Assignment API's

  @tag1
  Scenario: Add user
    Given Add user with "Selenium" and "AutomationLead"
    When user calls "adduserapi" with "POST" http request
    Then the API call got success with status code 201

  @tag2
  Scenario: verify username
    Given Validate the username
    When user calls "getuser" resource with "GET" http request
    And verify "name" in response body is "Luke Skywalker"
