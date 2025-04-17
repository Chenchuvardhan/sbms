package fasttrackjava;

import java.util.Scanner;

public class MyCalculator {
	static Scanner scn=new Scanner(System.in);
public static void main(String [] args) {
AdvanceArithmetic calci=x->{ int a=0;
	for(int i=1;i<x+1;i++) {
		if(x%i==0)
			a+=i;
	} return a; };
	System.out.print("Enter value :");
	int divisorsum=calci.divisorSum(scn.nextInt());
	System.out.println(divisorsum);
}
}
