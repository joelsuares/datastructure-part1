package series;

import java.util.Scanner;

public class sinseries {

	public static double fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		return (double) fact;
	}

	public static double base(double base, int power) {

		double result = 1;

		for (int i = 1; i <= power; i++) {
			result = result * base;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of x");
		double x = sc.nextDouble();

		System.out.println("Enter the value of n terms");
		double n = sc.nextDouble();

		double pi = 3.142;
		double r = x * pi / 180;
		double result = 0;
		

		int count = 0;

		for (int i = 1; i <= n; i = i + 2) {
			if (count % 2 == 0) {
				result = result + base(r, i) / fact(i);
			} else {
				result = result - base(r, i) / fact(i);
			}
			count++;
		}

		System.out.println(result);

	}

}
