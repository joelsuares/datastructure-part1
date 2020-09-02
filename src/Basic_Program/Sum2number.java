package Basic_Program;

import java.util.Scanner;
public class Sum2number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,z;
		System.out.println("Enter the 2 number ");
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		
		z=x+y;
		System.out.println("The sum of 2 number "+z);
	}

}
