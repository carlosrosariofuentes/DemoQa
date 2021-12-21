Feature: make a student registration
  as a new student,I want to enter the website of demoqa.com for make a register

  Scenario: enter data in the form fields
    Given i want to access the student registration form
    When i enter all data in form fields
      | firstName | lastName | email              | mobile     | subjects | select                               | adress         | state | city   |
      | Carlos    | Rosario  | carlitos@gmail.com | 1003358917 | Maths    | C:\Users\User\Documents\lalocura.txt | calle 32#12-74 | NCR   | Delphi |

    Then I see a successful registration



