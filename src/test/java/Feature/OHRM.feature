Feature: OrangeHRM Demo Website Functionality

	Background:
	Given the user is on the orangeHRM login page


	Scenario:Successful login with vlaid credentioals
	When the user enters username "Admin" and passowrd "admin123"
	And clicks the login button
	Then the user should be redirecteed to the dashboard page
	
	 Scenario Outline: Unsuccessful login with invalid credentials
    When the user enters username "<username>" and password "<password>"
    And clicks the login button
    Then an error message "Invalid credentials" should be displayed
    
      Examples:
      | username | password   |
      | Admin    | wrongpass  |
      | wronguser| admin123   |
      | wronguser| wrongpass  |
      
      
        Scenario: Navigate to the "Add Employee" page
    Given the user is logged in
    When the user clicks on the "PIM" tab
    And selects "Add Employee"
    Then the "Add Employee" form should be displayed
    
      Scenario Outline: Add a new employee with valid details
    Given the user is on the "Add Employee" page
    When the user enters first name "<firstName>", last name "<lastName>", and employee ID "<employeeID>"
    And clicks the save button
    Then the new employee "<firstName> <lastName>" should be added successfully

    Examples:
      | firstName | lastName | employeeID |
      | John      | Doe      | 001        |
      | Jane      | Smith    | 002       |
      
      
        Scenario: Search for an existing employee
    Given the user is on the "Employee List" page
    When the user enters employee name "John Doe" in the search field
    And clicks the search button
    Then the employee "John Doe" should be displayed in the search results
    
    
    Scenario: Apply for leave
    Given the user is logged in
    When the user navigates to the "Leave" section
    And selects "Apply"
    And chooses leave type "Annual Leave"
    And selects from date "2025-02-10" and to date "2025-02-12"
    And adds a comment "Vacation"
    And clicks the apply button
    Then a confirmation message "Successfully Applied" should be displayed
    
    Scenario: Approve a leave request
    Given the user is logged in as an admin
    When the user navigates to the "Leave List"
    And searches for leave requests from "2025-02-10" to "2025-02-12"
    And selects the pending leave request for "Jane Smith"
    And clicks the approve button
    Then the leave status for "Jane Smith" should be updated to "Approved"
    
      Scenario: Edit personal details
    Given the user is logged in
    When the user navigates to "My Info"
    And clicks the "Edit" button
    And updates the address to "123 Main St, Pune"
    And clicks the save button
    Then a confirmation message "Successfully Saved" should be displayed
    And the address should be updated to "123 Main St, Pune"
    
    Scenario: Change user password
    Given the user is logged in
    When the user navigates to "Change Password"
    And enters current password "admin123"
    And enters new password "newpass123"
    And confirms new password "newpass123"
    And clicks the save button
    Then a confirmation message "Password changed successfully" should be displayed
    
      Scenario: Logout from the application
    Given the user is logged in
    When the user clicks on the "Logout" button
    Then the user should be redirected to the login page
	