package Sorting;

import java.util.Random;

public class tournamentmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random sc = new Random();
		System.out.println("Enter a array length");

		int n = 5 + sc.nextInt(15);
		int[] arr = new int[2 * n];

		for (int i = n; i < arr.length; i++) {
			arr[i] = sc.nextInt(500);
		}
		System.out.println("Array");

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

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Maximium element is an array " + arr[1]);

		int secondmax = Integer.MIN_VALUE;
		int max = arr[1];
		int i=1; 
		
		while(i<=arr.length-1){
	
		}

	}

}
