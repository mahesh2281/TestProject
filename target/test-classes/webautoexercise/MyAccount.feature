Feature: My Account
  In order to update personal information
  As a customer,
  I require a my account section

  Scenario: Customer is able to change their first name
    Given I have signed in
    And I am on the my personal information page
    When I update my first name to "MaheshNew"
    Then the my personal information has been updated successfully