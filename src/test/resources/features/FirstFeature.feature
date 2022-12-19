Feature: this is my first test
  Scenario: testing first scenario
    Given browser is on
    Then Enter password "password1234"
    Then Click on sign in
    Then check my data table
      |Abdul          |salam          |salam@gmail.com    |
      |nick           |allen          |nick@gmail.com     |
      |bread          |crum           |bread@gmail.com    |
      |horse          |man            |horse@gmail.com    |
      |cat            |evil           |cat@gmail.com      |
      |dog            |friend         |dog@gmail.com      |
    Then close browser
    Then do something else