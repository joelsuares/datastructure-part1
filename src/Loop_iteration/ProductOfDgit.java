package Loop_iteration;

import java.util.Scanner;

public class ProductOfDgit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,res;
		int prodcut=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		n=sc.nextInt();
		
		while(n>0){
			prodcut=prodcut*(n%10);
			n=n/10;
			
		}
		System.out.println(prodcut);
		
	}

}
