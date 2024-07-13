@regression
Feature: Testing company End Points

  Scenario Outline: Happy Path Company End-Point and validate Information.
    Then User calls company endpoint and validates '<message>','<companyName>','<companyEmail>','<companyPhone>'
    Examples:
    |message|companyName|companyEmail|companyPhone|
    |Application data fetched successfully|techtorial|company@email.com|1234567891|


Scenario Outline: Happy Path End-Point and validate information in the app
  Then User calls company and validates '<message>' '<name>'
  Examples:
  |message|name|
  |Logged in successfully|test_dev|