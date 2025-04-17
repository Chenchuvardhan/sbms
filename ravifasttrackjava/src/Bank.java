/*
 * Bank Interface:
   -------------------
Methods:

Method name: deposit 
return type : void
parameters : double amount
throws InvalidAmountException
Deposits the specified amount into the account. Throws InvalidAmountException if the amount is less than or equal to zero.


Method name: withdraw 
return type : void
parameters : double amount
throws InsufficientFundsException, InvalidAmountException:
Withdraws the specified amount from the account. Throws InsufficientFundsException if the amount is greater than the account balance. Throws InvalidAmountException if the amount is less than or equal to zero.


Method name: transfer 
return type : void
parameters : (BankAccount toAccount, double amount) 
throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException: 
Transfers the specified amount to another account. Throws InsufficientFundsException if the amount is greater than the account balance. Throws AccountNotFoundException if the target account is not found. Throws InvalidAmountException if the amount is less than or equal to zero.


Method name: applyForLoan 
return type : void
parameters : (double amount) 
throws LoanNotAllowedException, InvalidAmountException:
Applies for a loan of the specified amount(50000). Throws LoanNotAllowedException if the loan amount exceeds the allowed limit(50000) or if the balance is less than specified amount(50000). Throws InvalidAmountException if the amount is less than or equal to zero.

Method name: getBalance 
return type : double
Returns the current balance of the account.

BankAccount Class(BLC):
Attributes:
accountNumber: long: private
balance:double: private

Implements Bank interface.
Methods:
Implement all methods from the Bank interface.
deposit(double amount): Increases the account balance by the specified amount. Throws InvalidAmountException if the amount is less than or equal to zero.

withdraw(double amount): Decreases the account balance by the specified amount. Throws InsufficientFundsException if the amount is greater than the account balance. Throws InvalidAmountException if the amount is less than or equal to zero.

transfer(BankAccount toAccount, double amount): Transfers the specified amount to another account. Throws InsufficientFundsException if the amount is greater than the account balance. Throws AccountNotFoundException if the target account is not found(i,e if toAccount is null). Throws InvalidAmountException if the amount is less than or equal to zero.

applyForLoan(double amount): Allows the user to apply for a loan. Throws LoanNotAllowedException if the loan amount exceeds the allowed limit. Throws InvalidAmountException if the amount is less than or equal to zero.

getBalance(): Returns the current balance of the account.
Constructor to initialize account number and initial balance.


Customer Class(BLC):
Attributes:
name: String: private
account: BankAccount: private //HAS-A

Methods:
Constructor to initialize the customer's name and account.

getAccount(): Returns the customer's bank account.

 */
public interface Bank {
void deposit(double amount);
void withdraw(double amount);
void transfer(BankAccount toAccount,double amount);
void checkBalance();
}
