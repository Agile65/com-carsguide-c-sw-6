Feature: Find the dealers and verify

  Background:
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab

  @sanity
  Scenario: Find the dealers and verify the dealers are in list
    And I click 'Find a dealer'
    Then I navigate to 'car-dealers' page
    And I should see the dealer names are display on page

      | dealersName                |
      | 3 Point Motors Epping      |
      | Cairns Car & 4WD Centre    |
    #    | 4WD Specialist Group    | doesn't exist SO REPLACED with above one
#      | 5 Star Auto                |
      | A & M Car Sales Pty Ltd    |
      | A1 Motors Company New Town |
#      | Coral Coast Ford           |
#    | ANDREA MOTORI SERVICE            |
#    | Oxford Motors                    |
