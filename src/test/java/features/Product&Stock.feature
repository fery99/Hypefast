Feature: user can see product and stock

  @web
  Scenario: discover list product
    Given user on login page of Melaka-
    When input email- "ferysadewaa@gmail.com"
    And input password- "Test1234"
    And click loggin button-
    And user on homepage dashboard-
    And user click Product and Stock
    And click product
    Then User get inform list of product

  @web
  Scenario: user edit item product
    Given user on login page of Melaka-
    When input email- "ferysadewaa@gmail.com"
    And input password- "Test1234"
    And click loggin button-
    And user on homepage dashboard-
    And user click Product and Stock
    And click product
    Then User get inform list of product
    And user click select and click change
    And User on edit page and scroll down
    And user edit weight "1250"
    And user edit dimension product height "15"
    And user click save
    Then user can see product has been edited on list

  @web
  Scenario: discover list product
    Given user on login page of Melaka-
    When input email- "ferysadewaa@gmail.com"
    And input password- "Test1234"
    And click loggin button-
    And user on homepage dashboard-
    And user click Product and Stock
    And click inventory Stock
    And User get list of product

  @web
  Scenario: discover view mapping of stock inventory
    Given user on login page of Melaka-
    When input email- "ferysadewaa@gmail.com"
    And input password- "Test1234"
    And click loggin button-
    And user on homepage dashboard-
    And user click Product and Stock
    And click inventory Stock
    And User get list of product
    And user icon pilih
    And user click maping of stock
    Then user can see detail information about maping stock


#
#  Scenario discover view maping of stock inventory
#    Given user on login page of Melaka-
#    When input email- "ferysadewaa@gmail.com"
#    And input password- "Test1234"
#    And click loggin button-
#    And user on homepage dashboard-
#    And user click Product and Stock
#    And click inventory Stock
#    And User get list of product
#    And user icon pilih
#    And user click add new stock
#    And user input value stock "2"
#    And click button save
#    And click save stock movement button
#    Then user back to list inventory stock and total stock has incrased
#
#  Scenario discover the movement of stock inventory
#    Given user on login page of Melaka-
#    When input email- "ferysadewaa@gmail.com"
#    And input password- "Test1234"
#    And click loggin button-
#    And user on homepage dashboard-
#    And user click Product and Stock
#    And click inventory Stock
#    And User get list of product
