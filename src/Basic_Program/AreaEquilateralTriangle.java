package Basic_Program;

import java.util.Scanner;
public class AreaEquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double side,Area;
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the side of eqilateral triangle");
		side = in.nextFloat();
		
		Area=(Math.sqrt(3) / 4)* (side * side);
		
		System.out.println("The area of eqilateral triangle "+Area +" sq. units");
		
		
		

	}

}
