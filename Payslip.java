import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Payslip {

    public void generate(Payroll payroll) {

        Employee emp = payroll.getEmployee();

        String[] columnNames = {
                "Employee ID",
                "Employee Name",
                "Department",
                "Basic Salary",
                "HRA",
                "DA",
                "Gross Salary"
        };

        Object[][] data = {
                {
                        emp.getEmpId(),
                        emp.getEmpName(),
                        emp.getDepartment(),
                        emp.getBasicSalary(),
                        payroll.getHRA(),
                        payroll.getDA(),
                        payroll.getGrossSalary()
                }
        };

        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane scrollPane = new JScrollPane(table);

        JFrame frame = new JFrame("Employee Payroll System");
        frame.add(scrollPane);
        frame.setSize(700, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}