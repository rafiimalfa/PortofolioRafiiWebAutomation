Feature: Landing page
@Testing
  Scenario: Landing hero section working properly
    Given User opens home page
    Then Heading should be visible
    And Click scroll down button
    And Verify heading about section is visible
   Then Verify scroll until my project section heading is visible