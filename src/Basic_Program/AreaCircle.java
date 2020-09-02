package Basic_Program;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double radius,Area,Diameter,circumference ;

		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the radius");
		radius = in.nextInt();
		
	 
		Diameter = 2*radius;
		circumference=2*3.14*radius;
		Area =3.14*radius*radius;
				
		
		  System.out.println("The Diameter of Circle is "+Diameter);
		  System.out.println("The circumference of Circle is "+circumference);
		  System.out.println("The Area of Circle is "+Area);
	}

}
