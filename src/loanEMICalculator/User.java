package loanEMICalculator;

//Design and implement an In Memory Loan EMI Calculator. 
//
//The code should have functionality to create users. Users can be either customer or admin. All users will have a unique identifier: username.
//Admin can create a Loan in the system for a customer.
//While creating a loan, admin_username, customer_username, principal amount, interest rate and time (loan tenure) need to be taken as input.
//The interest for the loan is calculated by I = (P*N*R)/100 where P is the principal amount, N is the number
//of years and R is the rate of interest. The total amount to repay will be A = P + I The amount should be paid back monthly in the form of EMIs. Each EMI = A/(N*12)
//Users should be able to make EMI payments for their loan only.

public interface User {
	
	String getUserName();

}
