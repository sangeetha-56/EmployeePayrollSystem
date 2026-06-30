import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField deptField = new JTextField();
        JTextField salaryField = new JTextField();

        Object[] message = {
                "Employee ID :", idField,
                "Employee Name :", nameField,
                "Department :", deptField,
                "Basic Salary :", salaryField
        };

        int option = JOptionPane.showConfirmDialog(
                null,
                message,
                "Employee Payroll System",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {

            if (!validateEmployeeID(idField.getText()))
                return;

            if (!validateEmployeeName(nameField.getText()))
                return;

            if (!validateDepartment(deptField.getText()))
                return;

            if (!validateSalary(salaryField.getText()))
                return;

            int id = Integer.parseInt(idField.getText().trim());
            String name = nameField.getText().trim();
            String dept = deptField.getText().trim();
            double salary = Double.parseDouble(salaryField.getText().trim());

            Employee emp = new Employee(id, name, dept, salary);

            Payroll payroll = new Payroll(emp);
            payroll.calculateSalary();

            Payslip payslip = new Payslip();
            payslip.generate(payroll);
        }
    }

    // Employee ID Validation
    public static boolean validateEmployeeID(String id) {

        id = id.trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Employee ID cannot be empty.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!id.matches("\\d+")) {
            JOptionPane.showMessageDialog(null,
                    "Employee ID must contain only numbers.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (id.length() != 4) {
            JOptionPane.showMessageDialog(null,
                    "Employee ID must be exactly 4 digits.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    // Employee Name Validation
    public static boolean validateEmployeeName(String name) {

        name = name.trim();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Employee Name cannot be empty.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!name.matches("[A-Za-z ]+")) {
            JOptionPane.showMessageDialog(null,
                    "Employee Name should contain only letters.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (name.length() < 3) {
            JOptionPane.showMessageDialog(null,
                    "Employee Name must be at least 3 characters.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    // Department Validation
    public static boolean validateDepartment(String dept) {

        dept = dept.trim();

        if (dept.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Department cannot be empty.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!dept.matches("[A-Za-z ]+")) {
            JOptionPane.showMessageDialog(null,
                    "Department should contain only letters.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (dept.length() < 2) {
            JOptionPane.showMessageDialog(null,
                    "Department name is too short.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    // Salary Validation
    public static boolean validateSalary(String salary) {

        salary = salary.trim();

        if (salary.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Salary cannot be empty.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {

            double sal = Double.parseDouble(salary);

            if (sal <= 0) {
                JOptionPane.showMessageDialog(null,
                        "Salary must be greater than zero.",
                        "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }

            if (sal > 1000000) {
                JOptionPane.showMessageDialog(null,
                        "Salary is too high.",
                        "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null,
                    "Salary must contain only numbers.",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
}