package Function;

import java.util.Scanner;

public class AddiitonandFact {

	public void addition() {
		int a;
		int b;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num1");
		a = sc.nextInt();
		System.out.println("Enter num 2");
		b = sc.nextInt();

		int c = a + b;
		System.out.println("RESULT= " + c);
	}

	public void addiition(int a, int b) {
		System.out.println("parameterized function");

		int c = a + b;
		System.out.println(c);
	}

	public int factorial() {

		int n;
		int fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public int pow(int base,int power){
		int result=1;
		for(int i=1; i<=power; i++){
			result=result*base;
			
		}
		return result;
	}
	
	public int cube(int n){
		return n*n*n;
	}
	
	public double Diameter(int n){
		return 2*n;
	}
	
	public double Area(int n){
		return 3.142*n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Starting of the program");
		AddiitonandFact obj = new AddiitonandFact();
		obj.addition();
		System.out.println("Parametrized function");
		obj.addiition(34, 57);
		System.out.println("Fact of funtion");
		int fact = obj.factorial();
		System.out.println("Factorial of number " + fact);

		System.out.println("Power function ");
		int n=obj.pow(2, 5);
		System.out.println("Power of a number "+n);
		
		System.out.println("Cube of a Number "+obj.cube(3));
		
		System.out.println("Area Of a Circle");
		System.out.println("Enter radius");
		Scanner sc=new Scanner(System.in);
		
		int r=sc.nextInt();
		double d=obj.Diameter(r);
		System.out.println("Diameter is "+d);
		
		System.out.println("Area of a circle");
		double area=obj.Area(r);
		System.out.println("Area of circle "+area);
		
		
	}

}
