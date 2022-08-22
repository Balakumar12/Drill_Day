Feature: TestProject functionality

  Scenario Outline: Contact Information
    Given browser is open
    And user is on Register
    When Enter the First Name
    And Enter the Last Name
    And Enter the Phone Number 7502672875
    And Enter the Email balakumar59192@gmail.com

  Scenario Outline: Mailing Information
  	When Enter the Address Chennai
  	And  Enter the City Guindy
  	And  Enter the State Tamil Nadu
  	And  Enter the post code 630557
  	And  user Select Country
  	
  Scenario Outline: User Information
  	When Enter the User Name Balakumar
  	And  Enter the Password Sample123
  	And  Enter the Confrim Password Sample123
  	Then Hit Submit button