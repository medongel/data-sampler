Feature: Account is prepared for direct debit review

  Scenario: Get Required Entities
    Given get active account
    Given get active product
    Given credit on the account
    Given create DD payment
    Given supply Start date is in the past
    Given GSP Group _A
    Given Product Type Electricity MPAN
    Then entities should be returned