package Sorting;

import java.util.Random;

public class InsertionSort {

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
		System.out.println("Array before sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("After sorting");

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];

			while (j >= 0 && arr[j] > key) {

				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1]=key;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
