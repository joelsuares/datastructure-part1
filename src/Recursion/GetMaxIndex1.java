package Recursion;

import java.util.Random;

public class GetMaxIndex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("buble sort");
		Random sc = new Random();

		int n = 10;
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(1000);
		}
		System.out.println("Before sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("After sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
