Feature: discover financial record and report download

#Analisis Bisinis

  @web
  Scenario: Discover Financial Records
    Given user on login page of Melaka
    When input email "ferysadewaa@gmail.com"
    And input password "Test1234"
    And click loggin button
    And user on homepage dashnoard
    And user click tap analisis bisnis
    And user click financial records

  @web
  Scenario: discover history of report download
    Given user on login page of Melaka
    When input email "ferysadewaa@gmail.com"
    And input password "Test1234"
    And click loggin button
    And user on homepage dashnoard
    And user click tap analisis bisnis
    And user click report of store
    And history of report download
    Then user can see list of history of report download

#  @web
#  Scenario: can add financial records of income
#    Given user on login page of Melaka
#    When input email "ferysadewaa@gmail.com"
#    And input password "Test1234"
#    And click loggin button
#    And user on homepage dashnoard
#    And user click tap analisis bisnis
#    And user click financial records
#    And click Tambahkan catatan
#    And user click category and click income from penjualan
#    And user input Total "200000"
#    And user input note "namanya okee"
#    And click date and click today
#    And click submit and new add button
#    Then user click financial record tab and user will see refresh page
#
#  @web
#  Scenario: can add financial records of expense
#    Given user on login page of Melaka
#    When input email "ferysadewaa@gmail.com"
#    And input password "Test1234"
#    And click loggin button
#    And user on homepage dashnoard
#    And user click tap analisis bisnis
#    And user click financial records
#    And click Tambahkan catatan
#    And user click category and click expense from penjualan
#    And user input Total "200000"
#    And user input note "namanya okee"
#    And click date and click today
#    And click submit and new add button
#    Then user click financial record tab and user will see refresh page
#
#   @web
#  Scenario: can add financial records of expense
#    Given user on login page of Melaka
#    When input email "ferysadewaa@gmail.com"
#    And input password "Test1234"
#    And click loggin button
#    And user on homepage dashnoard
#    And user click tap analisis bisnis
#    And user click financial records
#    And user click summary of financial records
#    And get inform about summary
#    And user click export pdf
#    Then user get file of download and redirect to Laporan Toko Page
#
#  @web
#  Scenario: discover history of report download
#    Given user on login page of Melaka
#    When input email "ferysadewaa@gmail.com"
#    And input password "Test1234"
#    And click loggin button
#    And user on homepage dashnoard
#    And user click tap analisis bisnis
#    And user click report of store
#    And history of report download
#    Then user can see list of history of report download