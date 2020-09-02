package Loop_iteration;

import java.util.Scanner;
public class FactorialOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n,fact=1;
		n=sc.nextInt();
		
		for(int i=n; i>=1; i--){
		
			fact=fact*i;
		}
		System.out.println("Factorial of a number "+fact);
	}

}
