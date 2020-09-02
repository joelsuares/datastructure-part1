package Loop_iteration;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, rev=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = sc.nextInt();
		
		while(n>0){
			rev=rev*10+(n%10);
			n=n/10;
		}
		System.out.println("Reverse a number "+rev);

		System.out.println(n);
	}

}
