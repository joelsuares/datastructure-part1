package Loop_iteration;

import java.util.Scanner;
public class sumofFistandLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n,first,last,sum; 
		
		System.out.println("ENTER A NUMBER");
		n=sc.nextInt();
		
		last=n%10; 
		for(int i=n; n>10; n=n/10){
//			System.out.println(n);
		}
		System.out.println("First digit "+n);
		System.out.println("last digit "+last);
		sum=n+last;
		System.out.println(sum);
		
		
	}

}
