package loanEMICalculator;

class CreateLoan {
    private String adminUsername;
    private String customerUsername;
    private double principalAmount;
    private double interestRate;
    private int loanTenure;

    public CreateLoan(String adminUsername, String customerUsername, double principalAmount, double interestRate, int loanTenure) {
        this.adminUsername = adminUsername;
        this.customerUsername = customerUsername;
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.loanTenure = loanTenure;
    }

    public void displayLoanDetails() {
        double interest = (principalAmount * loanTenure * interestRate) / 100;
        double totalAmount = principalAmount + interest;
        double emi = totalAmount / (loanTenure * 12);

        System.out.println("Loan Details:");
        System.out.println("Admin Username: " + adminUsername);
        System.out.println("Customer Username: " + customerUsername);
        System.out.println("Principal Amount: " + principalAmount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Loan Tenure: " + loanTenure);
        System.out.println("Total Amount to Repay: " + totalAmount);
        System.out.println("Monthly EMI: " + emi);
    }
}
