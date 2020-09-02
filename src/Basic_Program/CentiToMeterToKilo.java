package Basic_Program;

import java.util.Scanner;

public class CentiToMeterToKilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double centimeter,meter,killometer;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter Centimerer");
		centimeter = in.nextDouble();
		
		
		meter= centimeter/100;
		System.out.println("In meters "+meter);
		
		killometer =meter/100;
		System.out.println("In meters "+killometer);
		
	}

}
