package Basic_Program;

import java.util.Scanner;
public class Squrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num,sqrt;
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter number");
		num = in.nextInt();
		
		sqrt=Math.sqrt(num);
		
		System.out.println("Square root of a number "+sqrt);
		
				
	}

}
