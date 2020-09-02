package series;

import java.util.Scanner;

public class epowerxseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of x");
		double x = sc.nextDouble();

		System.out.println("Enter a value of n");
		double n = sc.nextDouble();

		double result = 1;
		double fact = 1;
		double pow = x;

		for (int i = 1; i <= n; i++) {
			result = result + x / fact;
			System.out.println(x + " " + fact);
			fact = fact * (i + 1);
			x = x * pow;

		}
		System.out.println("Result of e power x " + result);

	}

}
