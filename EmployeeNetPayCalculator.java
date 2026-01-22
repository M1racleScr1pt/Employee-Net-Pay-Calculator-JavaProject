import java.util.Scanner;

public class EmployeeNetPayCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly wage ($): ");
        double wage = input.nextDouble();

        System.out.print("Enter tax rate in percent (e.g., 20 for 20% tax): ");
        double taxRatePercent = input.nextDouble();

        double taxRate = taxRatePercent / 100.0;

        double grossPay = hours * wage;

        double taxAmount = grossPay * taxRate;

        double netPay = grossPay - taxAmount;

        System.out.println("\n--- Payroll Summary ---");

        System.out.printf("Gross Pay : $%,.2f%n", grossPay);
        System.out.printf("Tax (%d%%): $%,.2f%n", (int) taxRatePercent, taxAmount);
        System.out.printf("Net Pay   : $    %,.2f%n", netPay);

        input.close();

    }

}
