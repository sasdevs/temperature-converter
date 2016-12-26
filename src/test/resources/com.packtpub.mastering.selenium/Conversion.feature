Feature: Convert between different unit of temperatures

  Formula:  C/5 = (F-32)/9
  C= 5(F-32)/9 = 5(98.6-32 =)/9 = 37

  Scenario: Convert to Celsius from Fahrenheit
    Given I want to convert 98.6 F to C
    When I input the value of F as 98.6 in text field
    Then it should be converted to C as 37 degrees
