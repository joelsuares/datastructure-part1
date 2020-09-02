package Loop_iteration;

import java.util.Scanner;
public class swapFirstandlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,first,last,temp;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		n=sc.nextInt();
		
		
		last=n%10; 
		System.out.println("Last digit is "+last);
		
		for(int i=n; n>10; n=n/10){
			
		}
		first=n;
		System.out.println("First digit is "+first);
		
		System.out.println("****************************");
		
		temp=last;
		last=first;
		first=temp;
		
		System.out.println("last digit is "+last);
		System.out.println("First digit is "+first);
	}

}
