
import java.util.Scanner;

public class salarycalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        double totalSalary = basicSalary + bonus;

        System.out.println("Employee Name: " + name);
        System.out.printf("Total Salary: %.2f%n", totalSalary);

        sc.close();
    }
}
