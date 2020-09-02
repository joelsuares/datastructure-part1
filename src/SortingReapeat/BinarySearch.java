package SortingReapeat;

import java.util.Scanner;

public class BinarySearch {

	public int binarysearch(int arr[], int key) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (mid == key) {
				return key;
			}
			if (mid > key) {
				end = mid - 1;
			}
			if (mid < key) {
				start = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 2, 3, 4, 5, 6, 7, 8 };
		BinarySearch obj = new BinarySearch();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key");
		int key = sc.nextInt();
		int binarysearch = obj.binarysearch(arr, key);
		System.out.println(binarysearch);
	}

}
