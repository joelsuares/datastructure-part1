package Sorting;

import java.util.Random;

public class Tornamentmethod1stmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Array length");

		Random sc = new Random();
		int n = 5 + sc.nextInt(10);
		System.out.println(n);
		int arr[] = new int[2 * n];

		for (int i = n; i < arr.length; i++) {
			arr[i] = sc.nextInt(100);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int k = n - 1;

		for (int i = arr.length - 1; i >= 3; i = i - 2) {
			if (arr[i] > arr[i - 1]) {
				arr[k] = arr[i];
			} else {
				arr[k] = arr[i - 1];
			}
			k--;
		}

		System.out.println("1st maximum = " + arr[1]);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int secondMax = Integer.MIN_VALUE;

		int max = arr[1];
		int i = 1;

		while (i <= arr.length - 1) {
			int left = 2 * i;
			int right = 2 * i + 1;

			if (left < arr.length && arr[left] == max) {
				if (secondMax < arr[right]) {
					secondMax = arr[right];
				}
				i = left;
			} else if (right <= arr.length - 1) {
				if (secondMax < arr[left]) {
					secondMax = arr[left];
				}
				i = right;
			} else {
				break;
			}

		}

		System.out.println();
		System.out.println("Second max  = " + secondMax);

	}

}
