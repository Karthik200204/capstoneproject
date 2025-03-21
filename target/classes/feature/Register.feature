@Registration
Feature: User Registration
  
  @ValidRegistration

  Scenario: Successful registration with all required fields
    Given I am on the Demo Web Shop registration page
    When I enter "karthikreddy" as the first name
    And I enter "reddy" as the last name
    And I select "Male" as the gender
    And I enter the following credentials:
      | Email             | Password  | Confirm Password |
      | abcd@gmail.com    | 12345678  | 12345678         |

    And I click the "Register" button
    