Overview
This is a Java-based project that implements an employee salary system. The system allows you to add, remove, and display employee details, including their salaries.

Features
Create full-time and part-time employees with unique IDs and names.
Calculate salaries for full-time and part-time employees based on their monthly salary and hourly rate, respectively.
Add employees to the system.
Remove employees from the system by their ID.
Display employee details, including their names, IDs, and salaries.
Classes
Employee
Abstract class that represents an employee.
Has name and id attributes.
Has calculateSalary() method that must be implemented by subclasses.
FullTimeEmployee
Subclass of Employee that represents a full-time employee.
Has monthlySalary attribute.
Implements calculateSalary() method to return the monthly salary.
PartTimeEmployee
Subclass of Employee that represents a part-time employee.
Has hourRate and workedHours attributes.
Implements calculateSalary() method to return the hourly rate multiplied by the worked hours.
SalarySystem
Class that manages the employee salary system.
Has an ArrayList of Employee objects.
Has methods to add, remove, and display employees.
Usage
Compile the project using a Java compiler.
Run the Main class.
Follow the prompts to add employees, remove employees, and display employee details.
Note
The Scanner object is used to read user input.
The finally block is used to ensure that the Scanner object is closed after use.
The ArrayList is used to store employee objects.
The toString() method is overridden in the Employee class to provide a string representation of an employee.