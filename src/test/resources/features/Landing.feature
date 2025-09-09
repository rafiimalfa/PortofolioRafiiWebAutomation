Feature: Landing page
  @Testing
  Scenario: Landing hero section working properly
    Given User opens home page
    Then Heading should be visible
    And Click scroll down button
    And Verify heading about section is visible
   Then Verify scroll until my project section heading is visible

  @Testing
  Scenario: Verify all hero section working properly
    Given User already on rafiimalfa.com portofolio page
    Given Verify "HI! I AM" copywriting on hero section correct as per document
    Given Verify description "Quality Assurance"
    Given Verify my profile image capsule appear properly