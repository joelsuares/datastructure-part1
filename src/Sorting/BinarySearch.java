package Sorting;

import java.util.Scanner;

public class BinarySearch {

	public int binarySearch(int arr[], int key) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == key) {
				return key;
			} else if (arr[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 2, 3, 4, 5, 6, 7, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key");
		int key = sc.nextInt();
		BinarySearch obj = new BinarySearch();
		int binarySearch = obj.binarySearch(arr, key);
		System.out.println(binarySearch);

	}

}
