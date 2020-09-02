package Basic_Program;

import java.util.Scanner;
public class LengthBreathandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length,width,perimeter;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the length and width");
		length = in.nextInt();
		width = in.nextInt();
		
	 
		perimeter = 2*length*width;
		  System.out.println("The perimeter of rectangle is "+perimeter);
		
	}

}
