@Feature1
Feature: To validate the login detail of Amazon
@Smoke
  Scenario: To Validate using User name and Password
    When Launch the Amazon URL
    And Hover the mouse to sign button
    And To click on signIn button
    And Put the registered email/Phoneno to the usertext box
    And Click the continue button
    And Insert the password to passwordtext box
    And click on signin button
