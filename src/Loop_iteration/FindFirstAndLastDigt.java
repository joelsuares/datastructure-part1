package Loop_iteration;

import java.util.Scanner;
public class FindFirstAndLastDigt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,lastdigit,firstdigit; 
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		n=sc.nextInt();
		lastdigit= n%10;
		System.out.println("Last digit "+lastdigit);
		for(int i=n; n>10; n=n/10){
//			System.out.println(n);
		}
		System.out.println("First digit "+n);
		
		
		
	}
	

}
