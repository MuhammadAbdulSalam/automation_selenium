Feature: Login Screen Testing

  Scenario:  Positive Login Tests
    Given My browser is up and running and website is loaded 123
    Then Go to site Enter Username "salam101"
    Then Enter Password "myPassword" and "MysecondPassword"
    Then validate success login
