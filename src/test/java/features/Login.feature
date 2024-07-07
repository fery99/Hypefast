Feature: Melaka Test for Login with negatif and postive test case

  @web
  Scenario: login with not using email (Negative Case)
    Given user on login page of Melaka
    When input email "ferysadewaa.com"
    And input password "Test1234"
    And click loggin button
    Then user get red alert "Harap isi dengan format yang benar."


  @web
  Scenario: login with unike symbol (Negative Case)
    Given user on login page of Melaka
    When input email "!@#$%^&*()"
    And input password "Test1234"
    And click loggin button
    Then user get red alert "Harap isi dengan format yang benar."

  @web
  Scenario: login with not input mail (Negative Case)
    Given user on login page of Melaka
    When input email " "
    And input password "Test1234"
    And click loggin button
    Then user get red alertt "Wajib diisi."


  @web
  Scenario: login with not input mail (Negative Case)
    Given user on login page of Melaka
    When input email "ferysadewaa@gmail.com"
    And input password " "
    And click loggin button
    Then user get red alert "Wajib diisi."

  @web
  Scenario: login with invalid account (Negative Case)
    Given user on login page of Melaka
    When input email "ferysadew@gmail.com"
    And input password "Test1234"
    And click loggin button
    Then user get red alerttt "Email atau kata sandi tidak valid."

  @web
  Scenario: login with valid account (positive case)
    Given user on login page of Melaka
    When input email "ferysadewaa@gmail.com"
    And input password "Test1234"
    And click loggin button
    Then user on homepage dashnoard

















