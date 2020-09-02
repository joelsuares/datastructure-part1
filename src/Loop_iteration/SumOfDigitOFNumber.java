package Loop_iteration;

import java.util.Scanner;
public class SumOfDigitOFNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,res;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		
		while(n>0){
			res=n%10; 
			sum=sum+res;
			n=n/10;
		}
		System.out.println(sum);
		
		
		
	}

}
