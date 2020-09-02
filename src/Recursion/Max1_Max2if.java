package Recursion;

import java.util.Random;

public class Max1_Max2if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Array length");

		Random sc = new Random();
		int n = sc.nextInt(15);
		System.out.println(n);
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(10000);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int max1 = arr[0];
		int max2 = arr[1];
		if (arr[0] > arr[1]) {
			max1 = arr[0];
			max2 = arr[1];
		} else {
			max2 = arr[0];
			max1 = arr[1];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];

			} else if (arr[i] > max2 && arr[i] < max1) {
				max2 = arr[i];
			}
		}

		System.out.println(max1);
		System.out.println(max2);
	}

}
