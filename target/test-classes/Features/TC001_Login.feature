Feature: Login module

  Scenario Outline: Verifying orange hrm login page with valid credentials
    Given User on the orange hrm login page
    When User enters "<userName>" , "<password>"
    Then User should verify success messgae after login "Dashboard"

    Examples:
      | userName | password |
      | Admin    | admin123 |
