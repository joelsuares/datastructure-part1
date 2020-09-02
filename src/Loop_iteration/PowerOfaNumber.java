package Loop_iteration;

import java.util.Scanner;

public class PowerOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Base");
		int base = sc.nextInt();
		System.out.println("Enter a Exponnent");
		int exponent = sc.nextInt();
        int pow =1;
		int result=1;

		for (int i = 1; i <= exponent; i++) {

			pow=pow*base;
		}
		System.out.println(pow);

	}

}
