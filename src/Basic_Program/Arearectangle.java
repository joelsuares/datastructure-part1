package Basic_Program;

import java.util.Scanner;

public class Arearectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int length,width,Area;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the length and width");
		length = in.nextInt();
		width = in.nextInt();
		
	 
		Area = length*width;
		  System.out.println("The perimeter of rectangle is "+Area);
	}

}
