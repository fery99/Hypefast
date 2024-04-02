Feature: Test Prodia Admin UAT version

  @web
  Scenario: Search (Admin Transaction) by name user and view order detail
    Given user is on page prodia Admin UAT
    When user input username "solvingTest@prodia.co.id"
    And user input password ""
    And click continue button
    And User on Homepage Admin UAT
    And user click admin tranaction
    And user on page Admin Transaction
    And User Click cloumn search Transaction
    And User input keyword "Fery Dewa"
    And User press the enter button on Transaction
    And User get result of the search Transaction
    And User Click result of search by ID Transaction
    Then user get detail infrom of Transaction


  @web
  Scenario: Admin Transaction Filter & Download
    Given user is on page prodia Admin UAT
    When user input username "solvingTest@prodia.co.id"
    And user input password ""
    And click continue button
    And User on Homepage Admin UAT
    And user click admin tranaction
    And user on page Admin Transaction
    And user click filter by  service type
    And user filter by  service type
    #    service type "vacchine"
    And user click filter by  order status
    And user filter by  order status
    #    order status "Paid"
    And user click filter by  order detail
    And user filter by  order detail
    #    order detail "VA BCA"
    And User get result of a filter
    Then User can export data transaction

  @web
  Scenario: search name of doctor and detail doctor
    Given user is on page prodia Admin UAT
    When user input username "solvingTest@prodia.co.id"
    And user input password ""
    And click continue button
    And User on Homepage Admin UAT
    And User click DHC master pricing
    And User on page DHC master pricing
    And User Click cloumn search
    And User input keyword Doctor "Antonius"
    And User press the enter button on DHC
    And User get result of the search DHC
    And User Click result of search by ID DHC
    Then user get detail infrom of doctor search

  @web
  Scenario: filter name of doctor by category and view detail doctor
    Given user is on page prodia Admin UAT
    When user input username "solvingTest@prodia.co.id"
    And user input password ""
    And click continue button
    And User on Homepage Admin UAT
    And User click DHC master pricing
    And User on page DHC master pricing
    And user click filter by  verivication Status
    And user filter by verivication
    #    verivication Status "verived"
    And user click filter by profession
    And user filter by profession
    #    profession "All Type"
    And user get result of filter doctor
    And User Click one of the sample results based on the filter
    Then user get detail infrom of doctor filter














