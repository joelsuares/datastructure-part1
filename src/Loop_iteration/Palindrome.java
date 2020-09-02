package Loop_iteration;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,rev=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt();
		
		temp=n;
		
		while(n>0){
			rev=rev*10+(n%10);
			n=n/10;
		}
		System.out.println("Revese number "+rev);
		
		if(temp==rev){
			System.out.println("Number is Palindrome");
		}else{
			System.out.println("Number is not a Palindrome");
		}
		
	}

}
