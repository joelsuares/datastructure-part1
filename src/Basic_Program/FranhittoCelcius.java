package Basic_Program;

import java.util.Scanner;

public class FranhittoCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Celsius,Fahrenheit ;
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the tempreature in Fahrenheit");
		Fahrenheit = in.nextDouble();
		
		Celsius=(Fahrenheit-32)*5/9;
		System.out.println("Tempreasure in Fahrenheit " + Celsius+"c");
		

	}

}
