Feature: discover Point Loyalty and Malaka Point


#Promosi saya

  @web
  Scenario discover Point Loyalty
    Given user on login page of Melaka
    When input email "ferysadewaa@gmail.com"
    And input password "Test1234"
    And click loggin button
    And user on homepage dashnoard
    And user click tab my promotion
    And user click loyalty point

  @web
  Scenario discover Melaka Point
    Given user on login page of Melaka
    When input email "ferysadewaa@gmail.com"
    And input password "Test1234"
    And click loggin button
    And user on homepage dashnoard
    And user click tab my promotion
    And user click loyalty point

#  @web
#  Scenario edit my promotion
#    Given user on login page of Melaka
#    When input email "ferysadewaa@gmail.com"
#    And input password "Test1234"
#    And click loggin button
#    And user on homepage dashnoard
#    And user click tab my promotion
#    And user click loyalty point
#    And click change rule of point
#    And input minimum order "15000"
#    And input persentase "10"
#    And click button save rule of point
#    Then user will redirect to point loyalty page
#
#  @web
#  Scenario edit status inactive or active promotion of melaka
#    Given user on login page of Melaka
#    When input email "ferysadewaa@gmail.com"
#    And input password "Test1234"
#    And click loggin button
#    And user on homepage dashnoard
#    And user click tab my promotion
#    And click promotion melaka
#    And user get list of promotion Melaka
#    And active/inactive promotion
#    Then user has actived/inactived status, verifed by list promotion of melaka


