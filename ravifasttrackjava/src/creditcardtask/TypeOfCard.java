package creditcardtask;

import java.util.Scanner;

public class TypeOfCard {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter CreditCard Points =");
	int creditCardPoints=scn.nextInt();
	Customer customer=new Customer("Ravi");
	CardType ct=new CardType();
	System.out.println(ct.calculateTypeCard(customer, creditCardPoints)+" Card");
	
}
}
