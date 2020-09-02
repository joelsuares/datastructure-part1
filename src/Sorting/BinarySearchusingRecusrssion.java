package Sorting;

import java.util.*;

public class BinarySearchusingRecusrssion {

	public boolean BinaryRecurssion(int arr[], int start, int end, int key) {

		if (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] > key) {
				return BinaryRecurssion(arr, start, mid - 1, key);
			} else {
				return BinaryRecurssion(arr, mid + 1, end, key);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Key");

		int key = sc.nextInt();

		BinarySearchusingRecusrssion obj = new BinarySearchusingRecusrssion();

		int a[] = new int[] { 2, 3, 4, 5, 6, 7, 8 };

		boolean binaryRecurssion = obj.BinaryRecurssion(a, 0, a.length - 1, key);
		System.out.println(binaryRecurssion);
	}

}
