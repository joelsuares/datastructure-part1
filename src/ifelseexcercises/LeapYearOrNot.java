package ifelseexcercises;

import java.util.Scanner;
public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a year");
		year=in.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0){
			System.out.println("Its a leap year");
		}else{
			System.out.println("Its not a leap year");
		}
		
		
	}

}
