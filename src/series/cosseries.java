package series;

import java.util.Scanner;

public class cosseries {

	public static double fact(int n) {

		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return (double)fact;
	}

	public static double pow(double base, int pow) {
		double result = 1;
		for (int i = 1; i <= pow; i++) {
			result = result * base;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value of X");
		double x = sc.nextDouble();

		System.out.println("Enter a value of N");
		double n = sc.nextDouble();

		double result = 0;
		double pi = 3.142;
		double r = x * pi / 180;

		int count = 0;

		for (int i = 1; i <= n; i=i+2) {
			if (count % 2 == 0) {
				result = result + pow(r, i) / fact(i);
			} else {
				result = result - pow(r, i) + fact(i);
			}
			count++;
		}
		System.out.println(result);

	}

}
