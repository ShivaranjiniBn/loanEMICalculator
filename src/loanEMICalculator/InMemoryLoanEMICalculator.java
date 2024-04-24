package loanEMICalculator;

import java.util.Scanner;

public class InMemoryLoanEMICalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Admin Loan Creation");
        System.out.print("Enter Admin Username: ");
        String adminUsername = scanner.nextLine();

        System.out.print("Enter Customer Username: ");
        String customerUsername = scanner.nextLine();

        System.out.print("Enter Principal Amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter Loan Tenure (in years): ");
        int loanTenure = scanner.nextInt();

        CreateLoan loan = new  CreateLoan(adminUsername, customerUsername, principalAmount, interestRate, loanTenure);
        loan.displayLoanDetails();
    }
}