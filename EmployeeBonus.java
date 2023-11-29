import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the grade of the employee: ");
        char grade = scanner.next().charAt(0);

        
        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        
        double bonusPercentage;
        if (grade == 'A') {
            bonusPercentage = 0.05; // 5% bonus for grade A
        } else if (grade == 'B') {
            bonusPercentage = 0.10; // 10% bonus for grade B
        } else {
            System.out.println("Invalid grade entered. Please enter A or B.");
            return;
        }

        
        if (salary < 10000) {
            bonusPercentage += 0.02;
        }

        
        double bonus = salary * bonusPercentage;
        double totalSalary = salary + bonus;

        
        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid:" + totalSalary);
    }
}
