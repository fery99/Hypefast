Feature: Access information of my balance

  @web
  Scenario: discover information "My Balance"
    Given user on login page of Melaka#
    When input email# "ferysadewaa@gmail.com"
    And input password# "Test1234"
    And click loggin button#
    And user on homepage dashboard#
    And user click tab My Balance
    Then user get information about My Balance

  @web
  Scenario: discover checked History of my balance
    Given user on login page of Melaka#
    When input email# "ferysadewaa@gmail.com"
    And input password# "Test1234"
    And click loggin button#
    And user on homepage dashboard#
    And user click tab My Balance
    And user get information about My Balance
#    And User set start from and end date
#    And user click applied
    And user get information History of My Balance
