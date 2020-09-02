package Basic_Program;

import java.util.Scanner;
public class Thirdangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a,b,c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 2 angle");
		a=in.nextFloat();
		b=in.nextFloat();
		c=180-(a+b);
		
		System.out.println("The third angle is "+c);
		
		
	}

}
