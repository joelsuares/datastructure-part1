package Loop_iteration;

import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		
		int x;
		
		for(int i=n; n>0; n=n/10){
			int fact=1;
			x=n%10;
			for(int j=x; j>0; j--){
				fact=fact*j;
			}
			sum=sum+fact;
		}
		System.out.println(sum);
	
		if(sum==temp){
			System.out.println("Number is strong");
		}else{
			System.out.println("Number is not strong");
		}
		

	}

}
