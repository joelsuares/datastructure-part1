package Basic_Program;

import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double principle,time,intrest,SimpleIntrest;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter principle,time,intrest");
		principle = in.nextDouble();
		time = in.nextDouble();
		intrest = in.nextDouble();
		
		SimpleIntrest = (principle*time*intrest)/100;
		System.out.println("The Simple Intrest Is "+SimpleIntrest);
		
		

	}

}
