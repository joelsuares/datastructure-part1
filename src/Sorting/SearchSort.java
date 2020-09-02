package Sorting;

import java.util.Random;

public class SearchSort {

	public int getMaxindex(int arr[], int length) {

		int max = arr[0];
		int index = 0;

		for (int i = 1; i <= length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Array length");
		Random sc = new Random();
		int n = sc.nextInt(20);

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(1000);
		}
		System.out.println("Array before sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("Array after sorting");

		SearchSort obj = new SearchSort();

		for (int i = arr.length - 1; i >= 0; i--) {

			int maxindex = obj.getMaxindex(arr, i);

			int temp = arr[maxindex];
			arr[maxindex] = arr[i];
			arr[i] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
