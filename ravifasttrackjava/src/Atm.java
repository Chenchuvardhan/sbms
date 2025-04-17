import java.util.Scanner;
/*
 *         1. Deposit
           2. Withdraw
           3. Transfer
           4. Loan Application
           5. Check Balance
           6. Exit
 */
public class Atm {
	Customer customer;
	public Atm(Customer customer) {
		this.customer=customer;
	}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("Deposit-1");
	System.out.println("Withdarw-2");
	System.out.println("Transfer-3");
	System.out.println("Check Balance-4");
	System.out.println("Loan Application-4");
	System.out.println("Exit-6");
	int a=scn.nextInt();
	Customer customer1=new Customer("raj",new BankAccount(898636644L,25000));
	Customer customer2=new Customer("Tarun", new BankAccount(78734643L,20000));
	switch(a) {
	case 1:
		//deposit()
	case 2:
		//withdraw()
	case 3:
		//transfer
	case 4:
		//checkBalance
		
	case 5:
		//Loan Application
	case 6:
		System.exit(0);
	}
}
}
