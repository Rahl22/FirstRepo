@Feature2
Feature: To verify if the login page of facebook

@Sanity
  Scenario: To verify the facebook login page with email and password
    When To launch the facebok url
    And To enter the email to email box
    And To enter the password to password textbox
    And To click the login button

@Premitive @Smoke
   Scenario Outline: Verification of login functionalities of Fb page
   When launch the fb URL
   And Enter the positive or negative email "<email>" in textbox
   And Enter the posittive or negative pass "<pass>" in textbox
   And click lgn btn
   
   Examples:
   |email | pass |
   | Java | Advance@123 |
   | SQL |	PLSQL@123 |
