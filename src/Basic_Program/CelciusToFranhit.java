package Basic_Program;

import java.util.Scanner;
public class CelciusToFranhit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Celsius,Fahrenheit ;
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the tempreature in celcius");
		Celsius = in.nextDouble();
		
		Fahrenheit=(Celsius*9/5)+32;
		System.out.println("Tempreasure in Fahrenheit " + Fahrenheit);
		

	}

}
