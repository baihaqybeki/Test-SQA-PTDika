Feature: Rent Car

  Scenario: rent a car without driver
    When navigate url
    And choose "without driver" option
    And fill location
    And fill date
    And fill time
    And click search
    Then validate link "https://www.traveloka.com/id-id/car-rental/search?sd=20-9-2022&st=9-0&ed=21-9-2022&et=8-0&driverType=WITHOUT_DRIVER&city=Jakarta&fromLocation=TVLK.102813.PPR_ROUTE.REGION.Wilayah.Jakarta.%27%27."
    
    Scenario: rent a car without driver
    When navigate url
    And choose "with driver" option
    And fill location
    And fill date
    And fill time
    And click search
    Then validate link ""