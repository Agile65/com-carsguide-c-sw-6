Feature: Search functionality

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click ‘Search Cars’ link
    Then I navigate to "New & Used Car Search - carsguide" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car Tab
    Then I should see the make "<make1>" in results
    Examples:

      | make  | model     | location  | price  | make1 |
      | BMW   | 116i      | ACT - All | $3,000 | BMW   |
      | Audi  | A1        | ACT - All | $5,000 | AUDI  |
      | Ford  | Capri     | NT - All  | $3,000 | FORD  |
      | Honda | CRX       | ACT - All | $7,500 | HONDA |
      | Jeep  | Commander | ACT - All | $7,500 | JEEP  |
      | BMW   | 116i      | ACT - All | $5,000 | BMW   |


  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click 'Used' link
    Then I navigate to the "Used Cars For Sale" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car Tab
    Then I should see the make "<make1>" in results
    Examples:

      | make  | model     | location  | price  | make1 |
      | BMW   | 116i      | ACT - All | $3,000 | BMW   |
      | Audi  | A1        | ACT - All | $5,000 | AUDI  |
      | Ford  | Capri     | NT - All  | $3,000 | FORD  |
      | Honda | CRX       | ACT - All | $7,500 | HONDA |
      | Jeep  | Commander | ACT - All | $7,500 | JEEP  |
      | BMW   | 116i      | ACT - All | $3,000 | BMW   |