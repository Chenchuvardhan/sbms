
public class BankAccount implements Bank
{
private long accountNumber;
private double balance;
public BankAccount(long accountNumber, double balance) {
	this.accountNumber = accountNumber;
	this.balance = balance;
}
@Override
public void deposit(double amount) {
	// TODO Auto-generated method stub
	
}
@Override
public void withdraw(double amount) {
	// TODO Auto-generated method stub
	
}
@Override
public void transfer(BankAccount toAccount, double amount) {
	// TODO Auto-generated method stub
	
}
@Override
public void checkBalance() {
	// TODO Auto-generated method stub
	
}

}
