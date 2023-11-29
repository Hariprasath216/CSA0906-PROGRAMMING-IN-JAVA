import java.util.Scanner;

class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        name = name;
        basicSalary = basicSalary;
    }

    public double getSalary() {
        return basicSalary;
    }
}

class Manager extends Employee {
    private double travelAllowance;
    private double houseRentAllowance;

    public Manager(String name, double basicSalary, double travelAllowance, double houseRentAllowance) {
        super(name, basicSalary);
        travelAllowance = travelAllowance;
        houseRentAllowance = houseRentAllowance;
    }

    @Override
    public double getSalary() {
        return basicSalary + travelAllowance + houseRentAllowance;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee's name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Employee's basic salary: ");
        double empBasicSalary = scanner.nextDouble();

        Employee employee = new Employee(empName, empBasicSalary);
        System.out.println("Employee Salary: $" + employee.getSalary());

       
        System.out.print("\nEnter Manager's name: ");
        String mgrName = scanner.nextLine(); 
        mgrName = scanner.nextLine();

        System.out.print("Enter Manager's basic salary: ");
        double mgrBasicSalary = scanner.nextDouble();

        System.out.print("Enter Manager's travel allowance: ");
        double mgrTravelAllowance = scanner.nextDouble();

        System.out.print("Enter Manager's house rent allowance: ");
        double mgrHouseRentAllowance = scanner.nextDouble();

        Manager manager = new Manager(mgrName, mgrBasicSalary, mgrTravelAllowance, mgrHouseRentAllowance);
        System.out.println("Manager Salary: $" + manager.getSalary());
    }
}