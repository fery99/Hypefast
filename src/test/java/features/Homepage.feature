Feature: Base access of Melaka (only view), and try connect to marketplace

#Tab beranda
  @web
  Scenario: user get information of Overvieew Business
    Given user on login page of Melaka@
    When input email@ "ferysadewaa@gmail.com"
    And input password@ "Test1234"
    And click loggin button@
    And user on homepage dashboard@
    Then get information of Overvieew Business

  @web
  Scenario: user trying connect to shopee marketplace, via coloumn "Perlu Diproses"
    Given user on login page of Melaka@
    When input email@ "ferysadewaa@gmail.com"
    And input password@ "Test1234"
    And click loggin button@
    And user on homepage dashboard@
    And to coloumn order and click acces need process
    And user click add conection onlie shop
    And on list marketplace click add conection Marketplace
    And user click select option and select Shopee marketplace
    And user click connetion to market
    Then Authorize Shopee Openplatform APP


  @web
  Scenario: user trying connect to Tiktol Shop marketplace, via coloumn "Siap Dikirim"
    Given user on login page of Melaka
    When input email "ferysadewaa@gmail.com"
    And input password "Test1234"
    And click loggin button
    And user on homepage dashnoard
    And user coloumn order and acces perlu diproses
    And user click add conection onlie shop
    And on list marketplace click add conection Marketplace
    And user click select option and select Tiktok marketplace
    And user click connetion to market
    Then user on page TIktok Seller Center



















