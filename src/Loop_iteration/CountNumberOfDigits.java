package Loop_iteration;

import java.util.Scanner;
public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 digit Number");
		n=sc.nextInt();
		
		int count=0;
		
		for(int i=n; i>0; i=i/10){
			count++;
		}
		System.out.println(count);
	}

}
