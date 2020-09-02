package Basic_Program;


import java.util.Scanner;
public class powerprob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base,power,expo;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the base and expo");
		base = in.nextInt();
		expo = in.nextInt();
		
		power = Math.pow(base,expo);
		System.out.println(power);
		
		
	}

}
