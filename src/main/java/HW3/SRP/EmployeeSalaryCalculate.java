package SRP;

public class EmployeeSalaryCalculate {
    private int baseSalry;

    public EmployeeSalaryCalculate(int baseSalry) {
        this.baseSalry = baseSalry;
    }

    public int salaryCalculate() {
        return (int)(baseSalry * 1.25);
    }
}
