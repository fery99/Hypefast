Feature: access to my store, for team sales, catalog

  @web
  Scenario: on tab Store user cannot add sales
    Given user on login page of Melaka+
    When input email+ "ferysadewaa@gmail.com"
    And input password+ "Test1234"
    And click loggin button+
    And user on homepage dashboard+
    And click tab store
    And click Tim sales
    And click add sales
    And input Name "FERY SADEWA"
    And input "85648151760"
    And input email salese "ferysadewaa@gmail.com"
    And click save button
    Then user can see red alert "email already registered to another account or subaccount"

  @web
  Scenario: on tab Store user can add sales
    Given user on login page of Melaka+
    When input email+ "ferysadewaa@gmail.com"
    And input password+ "Test1234"
    And click loggin button+
    And user on homepage dashboard+
    And click tab store
    And click Tim sales
    And click add sales
    And input Name "Acong"
    And input "85648151760"
    And input email salese "surotong@email.com"
    And click save button
    Then User get update information on page

  @web
  Scenario: on tab Store user can delete sales
    Given user on login page of Melaka+
    When input email+ "ferysadewaa@gmail.com"
    And input password+ "Test1234"
    And click loggin button+
    And user on homepage dashboard+
    And click tab store
    And click Tim sales
    And user click icon trash
    And user see pop up, sure delete account sales
    And user click button yes click account sales
    Then User get update information on page

  @web
  Scenario: on tab Store user can delete sales
    Given user on login page of Melaka+
    When input email+ "ferysadewaa@gmail.com"
    And input password+ "Test1234"
    And click loggin button+
    And user on homepage dashboard+
    And click tab store
    And click Katalog Malaka
    Then user on page catalog malaka

  @web
  Scenario: on tab Store user can delete sales
    Given user on login page of Melaka+
    When input email+ "ferysadewaa@gmail.com"
    And input password+ "Test1234"
    And click loggin button+
    And user on homepage dashboard+
    And click tab store
    And click piutang
    Then user on page piutang
