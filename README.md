# Employee Payroll System

## Project Overview

The **Employee Payroll System** is a Java-based desktop application developed to manage employee payroll information efficiently. It allows users to enter employee details, calculate salary components such as HRA and DA, generate a payslip, and store employee records in a MySQL database using JDBC.

This project demonstrates the use of **Core Java**, **Object-Oriented Programming (OOP)**, **Java Swing**, **JDBC**, and **MySQL**.

---

## Features

* Add employee details
* Calculate HRA (House Rent Allowance)
* Calculate DA (Dearness Allowance)
* Calculate Gross Salary
* Generate employee payslip
* Input validation for all fields
* Store employee details in MySQL database
* Display employee details in a GUI table

---

## Technologies Used

* Java
* Java Swing
* JDBC (Java Database Connectivity)
* MySQL / MariaDB
* Visual Studio Code
* Git & GitHub

---

## Project Structure

```
EmployeePayrollSystem/
│
├── src/
│   ├── Employee.java
│   ├── Payroll.java
│   ├── Payslip.java
│   ├── DBConnection.java
│   ├── PayrollDAO.java
│   ├── Main.java
│   └── Test.java
│
├── lib/
│   └── mysql-connector-j.jar
│
└── README.md
```

---

## Database Setup

Create the database:

```sql
CREATE DATABASE payroll_db;
```

Select the database:

```sql
USE payroll_db;
```

Create the employee table:

```sql
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(50),
    basic_salary DOUBLE,
    hra DOUBLE,
    da DOUBLE,
    gross_salary DOUBLE
);
```

---

## Database Connection

Update the following values in `DBConnection.java` according to your MySQL configuration:

* Database URL
* Username
* Password
* Port Number (for example, 3306 or 3307)

Example:

```java
String url = "jdbc:mysql://localhost:3307/payroll_db";
String user = "root";
String password = "";
```

---

## How to Run the Project

1. Clone or download the project.
2. Open the project in Visual Studio Code.
3. Add the MySQL Connector/J JAR file to the project.
4. Create the `payroll_db` database and `employee` table.
5. Run `Main.java`.
6. Enter employee details.
7. The application calculates the salary and generates the payslip.
8. Employee information is stored in the MySQL database.

---

## Salary Calculation

* **HRA = 20% of Basic Salary**
* **DA = 10% of Basic Salary**
* **Gross Salary = Basic Salary + HRA + DA**

---

## Input Validation

The application validates the following:

* Employee ID cannot be empty.
* Employee ID must contain only numbers.
* Employee Name cannot be empty.
* Employee Name must contain only letters.
* Department cannot be empty.
* Department must contain only letters.
* Salary cannot be empty.
* Salary must be numeric.
* Salary must be greater than zero.

---

## Future Enhancements

* Update employee details
* Delete employee records
* Search employee by ID
* Print payslip
* Export payroll reports to PDF
* User login authentication

---

## Author

**Sangeetha**

---

## License

This project is developed for educational and academic purposes.
