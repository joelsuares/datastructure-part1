package ifelseexcercises;

import java.util.Scanner;

public class Maximum2number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 numbers");

		a = in.nextInt();
		b = in.nextInt();

		if (a > b) {
			System.out.println("a is greter then b");
		} else {
			System.out.println("b is greater ");
		}

	}

}
