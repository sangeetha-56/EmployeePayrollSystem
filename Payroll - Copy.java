public class Payroll {

    private Employee employee;
    private double hra;
    private double da;
    private double grossSalary;

    public Payroll(Employee employee) {
        this.employee = employee;
    }

    public void calculateSalary() {

        hra = employee.getBasicSalary() * 0.20;
        da = employee.getBasicSalary() * 0.10;

        grossSalary = employee.getBasicSalary() + hra + da;
    }

    public double getHRA() {
        return hra;
    }

    public double getDA() {
        return da;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public Employee getEmployee() {
        return employee;
    }
}