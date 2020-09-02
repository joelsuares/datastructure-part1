package Loop_iteration;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1, n2, min, hcf = 1;
		System.out.println("Enter 2 Number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		min = (n1 < n2) ? n1 : n2;

		for (int i = 1; i <= min; i++) {

			if (n1 % i == 0 && n2 % i == 0) {
				hcf = i;
			}

		}

		System.out.println(hcf);

	}

}
